package com.example.api

import android.content.Context

public class SdkBannerRequestConverter(
    public val context: Context,
) {
    public fun fromParcelable(parcelable: ParcelableSdkBannerRequest): SdkBannerRequest {
        val annotatedValue = SdkBannerRequest(
                appPackageName = parcelable.appPackageName,
                activityLauncher = SdkActivityLauncherAndBinderWrapper(parcelable.activityLauncher),
                isWebViewBannerAd = parcelable.isWebViewBannerAd)
        return annotatedValue
    }

    public fun toParcelable(annotatedValue: SdkBannerRequest): ParcelableSdkBannerRequest {
        val parcelable = ParcelableSdkBannerRequest()
        parcelable.appPackageName = annotatedValue.appPackageName
        parcelable.activityLauncher =
                SdkActivityLauncherAndBinderWrapper.getLauncherInfo(annotatedValue.activityLauncher)
        parcelable.isWebViewBannerAd = annotatedValue.isWebViewBannerAd
        return parcelable
    }
}
