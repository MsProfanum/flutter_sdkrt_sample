package com.example.api

import android.content.Context
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

public class SdkSandboxedUiAdapterStubDelegate internal constructor(
  public val `delegate`: SdkSandboxedUiAdapter,
  public val context: Context,
) : ISdkSandboxedUiAdapter.Stub() {
  private val coroutineScope: CoroutineScope = CoroutineScope(Dispatchers.Main)
}
