/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: /Users/kstrzyz/Library/Android/sdk/build-tools/35.0.0/aidl --lang=java --include=/var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270 --preprocessed=/Users/kstrzyz/Library/Android/sdk/platforms/android-35/framework.aidl --out=/var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270 /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/IStringTransactionCallback.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ISdkSandboxedUiAdapterTransactionCallback.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/IFullscreenAdTransactionCallback.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/IUnitTransactionCallback.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/IBundleTransactionCallback.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/PrivacySandboxThrowableParcel.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ParcelableStackFrame.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ICancellationSignal.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ISdkService.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ParcelableSdkBannerRequest.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/IMediateeAdapterInterface.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/IFullscreenAd.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ISdkSandboxedUiAdapterCoreLibInfoAndBinderWrapper.aidl /var/folders/t9/fcybv3yx5339rc589jj8b5vr01_yj1/T/aidl15532233887089492270/com/example/api/ISdkSandboxedUiAdapter.aidl
 */
package com.example.api;
public interface ICancellationSignal extends android.os.IInterface
{
  /** Default implementation for ICancellationSignal. */
  public static class Default implements com.example.api.ICancellationSignal
  {
    @Override public void cancel() throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.example.api.ICancellationSignal
  {
    /** Construct the stub at attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.example.api.ICancellationSignal interface,
     * generating a proxy if needed.
     */
    public static com.example.api.ICancellationSignal asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.example.api.ICancellationSignal))) {
        return ((com.example.api.ICancellationSignal)iin);
      }
      return new com.example.api.ICancellationSignal.Stub.Proxy(obj);
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
        case TRANSACTION_cancel:
        {
          this.cancel();
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements com.example.api.ICancellationSignal
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
      @Override public void cancel() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_cancel, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_cancel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12202374);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "com.example.api.ICancellationSignal";
  public void cancel() throws android.os.RemoteException;
}
