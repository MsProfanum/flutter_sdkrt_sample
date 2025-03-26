package com.example.api

import android.content.Context
import android.os.Bundle
import com.example.api.PrivacySandboxThrowableParcelConverter.toThrowableParcel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

public class FullscreenAdStubDelegate internal constructor(
  public val `delegate`: FullscreenAd,
  public val context: Context,
) : IFullscreenAd.Stub() {
  private val coroutineScope: CoroutineScope = CoroutineScope(Dispatchers.Main)

  public override fun show(activityLauncher: Bundle,
      transactionCallback: IUnitTransactionCallback) {
    val job = coroutineScope.launch {
      try {
        delegate.show(SdkActivityLauncherAndBinderWrapper(activityLauncher))
        transactionCallback.onSuccess()
      }
      catch (t: Throwable) {
        transactionCallback.onFailure(toThrowableParcel(t))
      }
    }
    val cancellationSignal = TransportCancellationCallback() { job.cancel() }
    transactionCallback.onCancellable(cancellationSignal)
  }
}
