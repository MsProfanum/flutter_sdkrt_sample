/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: /Users/kstrzyz/Library/Android/sdk/build-tools/35.0.0/aidl --lang=java --include=/var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270 --preprocessed=/Users/kstrzyz/Library/Android/sdk/platforms/android-35/framework.aidl --out=/var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270 /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/IStringTransactionCallback.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ISdkSandboxedUiAdapterTransactionCallback.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/IFullscreenAdTransactionCallback.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/IUnitTransactionCallback.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/IBundleTransactionCallback.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/PrivacySandboxThrowableParcel.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ParcelableStackFrame.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ICancellationSignal.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ISdkService.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ParcelableSdkBannerRequest.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/IMediateeAdapterInterface.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/IFullscreenAd.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ISdkSandboxedUiAdapterCoreLibInfoAndBinderWrapper.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ISdkSandboxedUiAdapter.aidl
 */
package com.example.api;
public interface ISdkService extends android.os.IInterface
{
  /** Default implementation for ISdkService. */
  public static class Default implements com.example.api.ISdkService
  {
    @Override public void createFile(int sizeInMb, com.example.api.IStringTransactionCallback transactionCallback) throws android.os.RemoteException
    {
    }
    @Override public void getBanner(com.example.api.ParcelableSdkBannerRequest request, com.example.api.ISdkSandboxedUiAdapterTransactionCallback transactionCallback) throws android.os.RemoteException
    {
    }
    @Override public void getFullscreenAd(java.lang.String mediationType, com.example.api.IFullscreenAdTransactionCallback transactionCallback) throws android.os.RemoteException
    {
    }
    @Override public void getMessage(com.example.api.IStringTransactionCallback transactionCallback) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.example.api.ISdkService
  {
    /** Construct the stub at attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.example.api.ISdkService interface,
     * generating a proxy if needed.
     */
    public static com.example.api.ISdkService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.example.api.ISdkService))) {
        return ((com.example.api.ISdkService)iin);
      }
      return new com.example.api.ISdkService.Stub.Proxy(obj);
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
        case TRANSACTION_createFile:
        {
          int _arg0;
          _arg0 = data.readInt();
          com.example.api.IStringTransactionCallback _arg1;
          _arg1 = com.example.api.IStringTransactionCallback.Stub.asInterface(data.readStrongBinder());
          this.createFile(_arg0, _arg1);
          break;
        }
        case TRANSACTION_getBanner:
        {
          com.example.api.ParcelableSdkBannerRequest _arg0;
          _arg0 = _Parcel.readTypedObject(data, com.example.api.ParcelableSdkBannerRequest.CREATOR);
          com.example.api.ISdkSandboxedUiAdapterTransactionCallback _arg1;
          _arg1 = com.example.api.ISdkSandboxedUiAdapterTransactionCallback.Stub.asInterface(data.readStrongBinder());
          this.getBanner(_arg0, _arg1);
          break;
        }
        case TRANSACTION_getFullscreenAd:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          com.example.api.IFullscreenAdTransactionCallback _arg1;
          _arg1 = com.example.api.IFullscreenAdTransactionCallback.Stub.asInterface(data.readStrongBinder());
          this.getFullscreenAd(_arg0, _arg1);
          break;
        }
        case TRANSACTION_getMessage:
        {
          com.example.api.IStringTransactionCallback _arg0;
          _arg0 = com.example.api.IStringTransactionCallback.Stub.asInterface(data.readStrongBinder());
          this.getMessage(_arg0);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements com.example.api.ISdkService
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
      @Override public void createFile(int sizeInMb, com.example.api.IStringTransactionCallback transactionCallback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(sizeInMb);
          _data.writeStrongInterface(transactionCallback);
          boolean _status = mRemote.transact(Stub.TRANSACTION_createFile, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void getBanner(com.example.api.ParcelableSdkBannerRequest request, com.example.api.ISdkSandboxedUiAdapterTransactionCallback transactionCallback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, request, 0);
          _data.writeStrongInterface(transactionCallback);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getBanner, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void getFullscreenAd(java.lang.String mediationType, com.example.api.IFullscreenAdTransactionCallback transactionCallback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(mediationType);
          _data.writeStrongInterface(transactionCallback);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getFullscreenAd, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void getMessage(com.example.api.IStringTransactionCallback transactionCallback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(transactionCallback);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getMessage, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_createFile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3692523);
    static final int TRANSACTION_getBanner = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7921056);
    static final int TRANSACTION_getFullscreenAd = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8904572);
    static final int TRANSACTION_getMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11682937);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "com.example.api.ISdkService";
  public void createFile(int sizeInMb, com.example.api.IStringTransactionCallback transactionCallback) throws android.os.RemoteException;
  public void getBanner(com.example.api.ParcelableSdkBannerRequest request, com.example.api.ISdkSandboxedUiAdapterTransactionCallback transactionCallback) throws android.os.RemoteException;
  public void getFullscreenAd(java.lang.String mediationType, com.example.api.IFullscreenAdTransactionCallback transactionCallback) throws android.os.RemoteException;
  public void getMessage(com.example.api.IStringTransactionCallback transactionCallback) throws android.os.RemoteException;
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
