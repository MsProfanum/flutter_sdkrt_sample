package com.example.api

import android.content.Context
import android.os.Bundle
import androidx.privacysandbox.activity.core.SdkActivityLauncher
import com.example.api.PrivacySandboxThrowableParcelConverter.fromThrowableParcel
import kotlin.coroutines.resumeWithException
import kotlinx.coroutines.suspendCancellableCoroutine

public class MediateeAdapterInterfaceClientProxy(
    public val remote: IMediateeAdapterInterface,
    public val context: Context,
) : MediateeAdapterInterface {
    public override suspend fun getBannerAd(
        appPackageName: String,
        activityLauncher: SdkActivityLauncher,
        isWebViewBannerAd: Boolean,
    ): Bundle = suspendCancellableCoroutine {
        var mCancellationSignal: ICancellationSignal? = null
        val transactionCallback = object: IBundleTransactionCallback.Stub() {
            override fun onCancellable(cancellationSignal: ICancellationSignal) {
                if (it.isCancelled) {
                    cancellationSignal.cancel()
                }
                mCancellationSignal = cancellationSignal
            }
            override fun onSuccess(result: Bundle) {
                it.resumeWith(Result.success(result))
            }
            override fun onFailure(throwableParcel: PrivacySandboxThrowableParcel) {
                it.resumeWithException(fromThrowableParcel(throwableParcel))
            }
        }
        remote.getBannerAd(appPackageName,
                SdkActivityLauncherAndBinderWrapper.getLauncherInfo(activityLauncher),
                isWebViewBannerAd, transactionCallback)
        it.invokeOnCancellation {
            mCancellationSignal?.cancel()
        }
    }

    public override suspend fun showFullscreenAd(activityLauncher: SdkActivityLauncher): Unit =
            suspendCancellableCoroutine {
        var mCancellationSignal: ICancellationSignal? = null
        val transactionCallback = object: IUnitTransactionCallback.Stub() {
            override fun onCancellable(cancellationSignal: ICancellationSignal) {
                if (it.isCancelled) {
                    cancellationSignal.cancel()
                }
                mCancellationSignal = cancellationSignal
            }
            override fun onSuccess() {
                it.resumeWith(Result.success(Unit))
            }
            override fun onFailure(throwableParcel: PrivacySandboxThrowableParcel) {
                it.resumeWithException(fromThrowableParcel(throwableParcel))
            }
        }
        remote.showFullscreenAd(SdkActivityLauncherAndBinderWrapper.getLauncherInfo(activityLauncher),
                transactionCallback)
        it.invokeOnCancellation {
            mCancellationSignal?.cancel()
        }
    }
}
