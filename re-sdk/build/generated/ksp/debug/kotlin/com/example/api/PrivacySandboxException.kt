package com.example.api

import java.lang.RuntimeException

public class PrivacySandboxException(
    public override val message: String?,
    public override val cause: Throwable?,
) : RuntimeException()
