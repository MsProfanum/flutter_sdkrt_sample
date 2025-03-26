package com.example.api

import android.os.Bundle

public object ISdkSandboxedUiAdapterCoreLibInfoAndBinderWrapperConverter {
    public fun toParcelable(coreLibInfo: Bundle, `interface`: ISdkSandboxedUiAdapter):
            ISdkSandboxedUiAdapterCoreLibInfoAndBinderWrapper {
        val parcelable = ISdkSandboxedUiAdapterCoreLibInfoAndBinderWrapper()
        parcelable.coreLibInfo = coreLibInfo
        parcelable.binder = `interface`
        return parcelable
    }
}
