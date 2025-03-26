package com.example.api

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.privacysandbox.sdkruntime.core.SandboxedSdkCompat
import androidx.privacysandbox.sdkruntime.core.SandboxedSdkProviderCompat
import kotlin.Int

public abstract class AbstractSandboxedSdkProviderCompat : SandboxedSdkProviderCompat() {
  public override fun onLoadSdk(params: Bundle): SandboxedSdkCompat {
    val ctx = context
    if (ctx == null) {
      throw IllegalStateException("Context must not be null. Do you need to call attachContext()?")
    }
    val sdk = createSdkService(ctx)
    return SandboxedSdkCompat(SdkServiceStubDelegate(sdk, ctx))
  }

  public override fun getView(
    windowContext: Context,
    params: Bundle,
    width: Int,
    height: Int,
  ): View = throw
      UnsupportedOperationException("This SDK doesn't support explicit SurfaceView requests.")

  protected abstract fun createSdkService(context: Context): SdkService
}
