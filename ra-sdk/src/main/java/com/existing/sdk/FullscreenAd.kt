package com.existing.sdk

import android.content.Context
import android.content.Intent
import androidx.fragment.app.FragmentActivity
import androidx.privacysandbox.activity.client.createSdkActivityLauncher
import androidx.privacysandbox.activity.core.SdkActivityLauncher
import com.example.api.FullscreenAd

class FullscreenAd(private val sdkFullscreenAd: FullscreenAd) {
    suspend fun show(baseActivity: FragmentActivity, allowSdkActivityLaunch: () -> Boolean) {
        val activityLauncher = baseActivity.createSdkActivityLauncher(allowSdkActivityLaunch)
        sdkFullscreenAd.show(activityLauncher)
    }

    companion object {
        suspend fun create(
            context: Context,
            mediationType: String,
        ): com.existing.sdk.FullscreenAd {
            if (ExistingSdk.isSdkLoaded()) {
                val remoteFullscreenAd =
                    ExistingSdk.loadSdkIfNeeded(context)?.getFullscreenAd(mediationType)

                if (remoteFullscreenAd != null)
                    return FullscreenAd(remoteFullscreenAd)
            }
            return FullscreenAd(LocalFullscreenAdImpl(context))
        }
    }

    internal class LocalFullscreenAdImpl(private val context: Context) : FullscreenAd {
        override suspend fun show(activityLauncher: SdkActivityLauncher) {
            val intent = Intent(context, LocalActivity::class.java)
            context.startActivity(intent)
        }
    }
}