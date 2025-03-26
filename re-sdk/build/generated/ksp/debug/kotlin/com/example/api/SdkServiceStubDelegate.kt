package com.example.api

import android.content.Context
import androidx.privacysandbox.ui.provider.toCoreLibInfo
import com.example.api.PrivacySandboxThrowableParcelConverter.toThrowableParcel
import kotlin.Int
import kotlin.String
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

public class SdkServiceStubDelegate internal constructor(
  public val `delegate`: SdkService,
  public val context: Context,
) : ISdkService.Stub() {
  private val coroutineScope: CoroutineScope = CoroutineScope(Dispatchers.Main)

  public override fun getMessage(transactionCallback: IStringTransactionCallback) {
    val job = coroutineScope.launch {
      try {
        val result = delegate.getMessage()
        transactionCallback.onSuccess(result)
      }
      catch (t: Throwable) {
        transactionCallback.onFailure(toThrowableParcel(t))
      }
    }
    val cancellationSignal = TransportCancellationCallback() { job.cancel() }
    transactionCallback.onCancellable(cancellationSignal)
  }

  public override fun createFile(sizeInMb: Int, transactionCallback: IStringTransactionCallback) {
    val job = coroutineScope.launch {
      try {
        val result = delegate.createFile(sizeInMb)
        transactionCallback.onSuccess(result)
      }
      catch (t: Throwable) {
        transactionCallback.onFailure(toThrowableParcel(t))
      }
    }
    val cancellationSignal = TransportCancellationCallback() { job.cancel() }
    transactionCallback.onCancellable(cancellationSignal)
  }

  public override fun getBanner(request: ParcelableSdkBannerRequest,
      transactionCallback: ISdkSandboxedUiAdapterTransactionCallback) {
    val job = coroutineScope.launch {
      try {
        val result = delegate.getBanner(SdkBannerRequestConverter(context).fromParcelable(request))
        transactionCallback.onSuccess(ISdkSandboxedUiAdapterCoreLibInfoAndBinderWrapperConverter.toParcelable(result.toCoreLibInfo(context),
            SdkSandboxedUiAdapterStubDelegate(result, context)))
      }
      catch (t: Throwable) {
        transactionCallback.onFailure(toThrowableParcel(t))
      }
    }
    val cancellationSignal = TransportCancellationCallback() { job.cancel() }
    transactionCallback.onCancellable(cancellationSignal)
  }

  public override fun getFullscreenAd(mediationType: String,
      transactionCallback: IFullscreenAdTransactionCallback) {
    val job = coroutineScope.launch {
      try {
        val result = delegate.getFullscreenAd(mediationType)
        transactionCallback.onSuccess(FullscreenAdStubDelegate(result, context))
      }
      catch (t: Throwable) {
        transactionCallback.onFailure(toThrowableParcel(t))
      }
    }
    val cancellationSignal = TransportCancellationCallback() { job.cancel() }
    transactionCallback.onCancellable(cancellationSignal)
  }
}
