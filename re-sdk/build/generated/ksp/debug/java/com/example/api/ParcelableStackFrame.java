/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: /Users/kstrzyz/Library/Android/sdk/build-tools/35.0.0/aidl --lang=java --include=/var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270 --preprocessed=/Users/kstrzyz/Library/Android/sdk/platforms/android-35/framework.aidl --out=/var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270 /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/IStringTransactionCallback.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ISdkSandboxedUiAdapterTransactionCallback.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/IFullscreenAdTransactionCallback.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/IUnitTransactionCallback.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/IBundleTransactionCallback.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/PrivacySandboxThrowableParcel.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ParcelableStackFrame.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ICancellationSignal.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ISdkService.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ParcelableSdkBannerRequest.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/IMediateeAdapterInterface.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/IFullscreenAd.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ISdkSandboxedUiAdapterCoreLibInfoAndBinderWrapper.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ISdkSandboxedUiAdapter.aidl
 */
package com.example.api;
public class ParcelableStackFrame implements android.os.Parcelable
{
  public java.lang.String declaringClass;
  public java.lang.String fileName;
  public java.lang.String methodName;
  public int lineNumber = 0;
  public static final android.os.Parcelable.Creator<ParcelableStackFrame> CREATOR = new android.os.Parcelable.Creator<ParcelableStackFrame>() {
    @Override
    public ParcelableStackFrame createFromParcel(android.os.Parcel _aidl_source) {
      ParcelableStackFrame _aidl_out = new ParcelableStackFrame();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public ParcelableStackFrame[] newArray(int _aidl_size) {
      return new ParcelableStackFrame[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeString(declaringClass);
    _aidl_parcel.writeString(fileName);
    _aidl_parcel.writeString(methodName);
    _aidl_parcel.writeInt(lineNumber);
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
      declaringClass = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      fileName = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      methodName = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      lineNumber = _aidl_parcel.readInt();
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
    return _mask;
  }
}
