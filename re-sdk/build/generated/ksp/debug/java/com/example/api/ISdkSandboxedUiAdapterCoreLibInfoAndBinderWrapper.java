/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: /Users/kstrzyz/Library/Android/sdk/build-tools/35.0.0/aidl --lang=java --include=/var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270 --preprocessed=/Users/kstrzyz/Library/Android/sdk/platforms/android-35/framework.aidl --out=/var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270 /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/IStringTransactionCallback.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ISdkSandboxedUiAdapterTransactionCallback.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/IFullscreenAdTransactionCallback.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/IUnitTransactionCallback.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/IBundleTransactionCallback.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/PrivacySandboxThrowableParcel.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ParcelableStackFrame.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ICancellationSignal.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ISdkService.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ParcelableSdkBannerRequest.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/IMediateeAdapterInterface.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/IFullscreenAd.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ISdkSandboxedUiAdapterCoreLibInfoAndBinderWrapper.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ISdkSandboxedUiAdapter.aidl
 */
package com.example.api;
public class ISdkSandboxedUiAdapterCoreLibInfoAndBinderWrapper implements android.os.Parcelable
{
  public android.os.Bundle coreLibInfo;
  public com.example.api.ISdkSandboxedUiAdapter binder;
  public static final android.os.Parcelable.Creator<ISdkSandboxedUiAdapterCoreLibInfoAndBinderWrapper> CREATOR = new android.os.Parcelable.Creator<ISdkSandboxedUiAdapterCoreLibInfoAndBinderWrapper>() {
    @Override
    public ISdkSandboxedUiAdapterCoreLibInfoAndBinderWrapper createFromParcel(android.os.Parcel _aidl_source) {
      ISdkSandboxedUiAdapterCoreLibInfoAndBinderWrapper _aidl_out = new ISdkSandboxedUiAdapterCoreLibInfoAndBinderWrapper();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public ISdkSandboxedUiAdapterCoreLibInfoAndBinderWrapper[] newArray(int _aidl_size) {
      return new ISdkSandboxedUiAdapterCoreLibInfoAndBinderWrapper[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _Parcel.writeTypedObject(_aidl_parcel, coreLibInfo, _aidl_flag);
    _aidl_parcel.writeStrongInterface(binder);
    int _aidl_end_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.setDataPosition(_aidl_start_pos);
    _aidl_parcel.writeInt(_aidl_end_pos - _aidl_start_pos);
    _aidl_parcel.setDataPosition(_aidl_end_pos);
  }
  public final void readFromParcel(android.os.Parcel _aidl_parcel)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    int _aidl_parcelable_size = _aidl_parcel.readInt();
    try {
      if (_aidl_parcelable_size < 4) throw new android.os.BadParcelableException("Parcelable too small");;
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      coreLibInfo = _Parcel.readTypedObject(_aidl_parcel, android.os.Bundle.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      binder = com.example.api.ISdkSandboxedUiAdapter.Stub.asInterface(_aidl_parcel.readStrongBinder());
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    _mask |= describeContents(coreLibInfo);
    return _mask;
  }
  private int describeContents(Object _v) {
    if (_v == null) return 0;
    if (_v instanceof android.os.Parcelable) {
      return ((android.os.Parcelable) _v).describeContents();
    }
    return 0;
  }
  /** @hide */
  static class _Parcel {
    static private <T> T readTypedObject(
        android.os.Parcel parcel,
        android.os.Parcelable.Creator<T> c) {
      if (parcel.readInt() != 0) {
          return c.createFromParcel(parcel);
      } else {
          return null;
      }
    }
    static private <T extends android.os.Parcelable> void writeTypedObject(
        android.os.Parcel parcel, T value, int parcelableFlags) {
      if (value != null) {
        parcel.writeInt(1);
        value.writeToParcel(parcel, parcelableFlags);
      } else {
        parcel.writeInt(0);
      }
    }
  }
}
