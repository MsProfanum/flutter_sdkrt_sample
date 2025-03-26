/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: /Users/kstrzyz/Library/Android/sdk/build-tools/35.0.0/aidl --lang=java --include=/var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270 --preprocessed=/Users/kstrzyz/Library/Android/sdk/platforms/android-35/framework.aidl --out=/var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270 /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/IStringTransactionCallback.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ISdkSandboxedUiAdapterTransactionCallback.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/IFullscreenAdTransactionCallback.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/IUnitTransactionCallback.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/IBundleTransactionCallback.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/PrivacySandboxThrowableParcel.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ParcelableStackFrame.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ICancellationSignal.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ISdkService.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ParcelableSdkBannerRequest.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/IMediateeAdapterInterface.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/IFullscreenAd.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ISdkSandboxedUiAdapterCoreLibInfoAndBinderWrapper.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ISdkSandboxedUiAdapter.aidl
 */
package com.example.api;
public interface IMediateeAdapterInterface extends android.os.IInterface
{
  /** Default implementation for IMediateeAdapterInterface. */
  public static class Default implements com.example.api.IMediateeAdapterInterface
  {
    @Override public void getBannerAd(java.lang.String appPackageName, android.os.Bundle activityLauncher, boolean isWebViewBannerAd, com.example.api.IBundleTransactionCallback transactionCallback) throws android.os.RemoteException
    {
    }
    @Override public void showFullscreenAd(android.os.Bundle activityLauncher, com.example.api.IUnitTransactionCallback transactionCallback) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.example.api.IMediateeAdapterInterface
  {
    /** Construct the stub at attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.example.api.IMediateeAdapterInterface interface,
     * generating a proxy if needed.
     */
    public static com.example.api.IMediateeAdapterInterface asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.example.api.IMediateeAdapterInterface))) {
        return ((com.example.api.IMediateeAdapterInterface)iin);
      }
      return new com.example.api.IMediateeAdapterInterface.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(descriptor);
      }
      if (code == INTERFACE_TRANSACTION) {
        reply.writeString(descriptor);
        return true;
      }
      switch (code)
      {
        case TRANSACTION_getBannerAd:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          android.os.Bundle _arg1;
          _arg1 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          boolean _arg2;
          _arg2 = (0!=data.readInt());
          com.example.api.IBundleTransactionCallback _arg3;
          _arg3 = com.example.api.IBundleTransactionCallback.Stub.asInterface(data.readStrongBinder());
          this.getBannerAd(_arg0, _arg1, _arg2, _arg3);
          break;
        }
        case TRANSACTION_showFullscreenAd:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          com.example.api.IUnitTransactionCallback _arg1;
          _arg1 = com.example.api.IUnitTransactionCallback.Stub.asInterface(data.readStrongBinder());
          this.showFullscreenAd(_arg0, _arg1);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements com.example.api.IMediateeAdapterInterface
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public void getBannerAd(java.lang.String appPackageName, android.os.Bundle activityLauncher, boolean isWebViewBannerAd, com.example.api.IBundleTransactionCallback transactionCallback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(appPackageName);
          _Parcel.writeTypedObject(_data, activityLauncher, 0);
          _data.writeInt(((isWebViewBannerAd)?(1):(0)));
          _data.writeStrongInterface(transactionCallback);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getBannerAd, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void showFullscreenAd(android.os.Bundle activityLauncher, com.example.api.IUnitTransactionCallback transactionCallback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, activityLauncher, 0);
          _data.writeStrongInterface(transactionCallback);
          boolean _status = mRemote.transact(Stub.TRANSACTION_showFullscreenAd, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_getBannerAd = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5747385);
    static final int TRANSACTION_showFullscreenAd = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3416838);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "com.example.api.IMediateeAdapterInterface";
  public void getBannerAd(java.lang.String appPackageName, android.os.Bundle activityLauncher, boolean isWebViewBannerAd, com.example.api.IBundleTransactionCallback transactionCallback) throws android.os.RemoteException;
  public void showFullscreenAd(android.os.Bundle activityLauncher, com.example.api.IUnitTransactionCallback transactionCallback) throws android.os.RemoteException;
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
