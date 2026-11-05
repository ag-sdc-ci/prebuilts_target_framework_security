/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/aidl-gen/android.security.maintenance-java-source -I /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/aidl -I /home/shadichy/Documents/bliss/los-21/system/hardware/interfaces/keystore2/aidl/aidl_api/android.system.keystore2/4 -I /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/aidl/android/security/maintenance/IKeystoreMaintenance.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.security.maintenance;
/**
 * IKeystoreMaintenance interface exposes the methods for adding/removing users and changing the
 * user's password.
 * @hide
 */
public interface IKeystoreMaintenance extends android.os.IInterface
{
  /** Default implementation for IKeystoreMaintenance. */
  public static class Default implements android.security.maintenance.IKeystoreMaintenance
  {
    /**
     * Allows LockSettingsService to inform keystore about adding a new user.
     * Callers require 'ChangeUser' permission.
     * 
     * ## Error conditions:
     * `ResponseCode::PERMISSION_DENIED` - if the callers do not have the 'ChangeUser' permission.
     * `ResponseCode::SYSTEM_ERROR` - if failed to delete the keys of an existing user with the same
     * user id.
     * 
     * @param userId - Android user id
     */
    @Override public void onUserAdded(int userId) throws android.os.RemoteException
    {
    }
    /**
     * Allows LockSettingsService to tell Keystore to create a user's superencryption keys and store
     * them encrypted by the given secret.  Requires 'ChangeUser' permission.
     * 
     * ## Error conditions:
     * `ResponseCode::PERMISSION_DENIED` - if caller does not have the 'ChangeUser' permission
     * `ResponseCode::SYSTEM_ERROR` - if failed to initialize the user's super keys
     * 
     * @param userId - Android user id
     * @param password - a secret derived from the synthetic password of the user
     * @param allowExisting - if true, then the keys already existing is not considered an error
     */
    @Override public void initUserSuperKeys(int userId, byte[] password, boolean allowExisting) throws android.os.RemoteException
    {
    }
    /**
     * Allows LockSettingsService to inform keystore about removing a user.
     * Callers require 'ChangeUser' permission.
     * 
     * ## Error conditions:
     * `ResponseCode::PERMISSION_DENIED` - if the callers do not have the 'ChangeUser' permission.
     * `ResponseCode::SYSTEM_ERROR` - if failed to delete the keys of the user being deleted.
     * 
     * @param userId - Android user id
     */
    @Override public void onUserRemoved(int userId) throws android.os.RemoteException
    {
    }
    /**
     * Allows LockSettingsService to tell Keystore that a user's LSKF is being removed, ie the
     * user's lock screen is changing to Swipe or None.  Requires 'ChangePassword' permission.
     * 
     * ## Error conditions:
     * `ResponseCode::PERMISSION_DENIED` - if caller does not have the 'ChangePassword' permission
     * `ResponseCode::SYSTEM_ERROR` - if failed to delete the user's auth-bound keys
     * 
     * @param userId - Android user id
     */
    @Override public void onUserLskfRemoved(int userId) throws android.os.RemoteException
    {
    }
    /**
     * Allows LockSettingsService to inform keystore about password change of a user.
     * Callers require 'ChangePassword' permission.
     * 
     * ## Error conditions:
     * `ResponseCode::PERMISSION_DENIED` - if the callers does not have the 'ChangePassword'
     *                                     permission.
     * `ResponseCode::SYSTEM_ERROR` - if failed to delete the super encrypted keys of the user.
     * `ResponseCode::Locked' -  if the keystore is locked for the given user.
     * 
     * @param userId - Android user id
     * @param password - a secret derived from the synthetic password of the user
     */
    @Override public void onUserPasswordChanged(int userId, byte[] password) throws android.os.RemoteException
    {
    }
    /**
     * This function deletes all keys within a namespace. It mainly gets called when an app gets
     * removed and all resources of this app need to be cleaned up.
     * 
     * @param domain - One of Domain.APP or Domain.SELINUX.
     * @param nspace - The UID of the app that is to be cleared if domain is Domain.APP or
     *                 the SEPolicy namespace if domain is Domain.SELINUX.
     */
    @Override public void clearNamespace(int domain, long nspace) throws android.os.RemoteException
    {
    }
    /**
     * This function notifies the Keymint device of the specified securityLevel that
     * early boot has ended, so that they no longer allow early boot keys to be used.
     * ## Error conditions:
     * `ResponseCode::PERMISSION_DENIED` - if the caller does not have the 'EarlyBootEnded'
     *                                     permission.
     * A KeyMint ErrorCode may be returned indicating a backend diagnosed error.
     */
    @Override public void earlyBootEnded() throws android.os.RemoteException
    {
    }
    /**
     * Informs Keystore 2.0 that the an off body event was detected.
     * 
     * ## Error conditions:
     * `ResponseCode::PERMISSION_DENIED` - if the caller does not have the `ReportOffBody`
     *                                     permission.
     * `ResponseCode::SYSTEM_ERROR` - if an unexpected error occurred.
     */
    @Override public void onDeviceOffBody() throws android.os.RemoteException
    {
    }
    /**
     * Migrate a key from one namespace to another. The caller must have use, grant, and delete
     * permissions on the source namespace and rebind permissions on the destination namespace.
     * The source may be specified by Domain::APP, Domain::SELINUX, or Domain::KEY_ID. The target
     * may be specified by Domain::APP or Domain::SELINUX.
     * 
     * ## Error conditions:
     * `ResponseCode::PERMISSION_DENIED` - If the caller lacks any of the required permissions.
     * `ResponseCode::KEY_NOT_FOUND` - If the source did not exist.
     * `ResponseCode::INVALID_ARGUMENT` - If the target exists or if any of the above mentioned
     *                                    requirements for the domain parameter are not met.
     * `ResponseCode::SYSTEM_ERROR` - An unexpected system error occurred.
     */
    @Override public void migrateKeyNamespace(android.system.keystore2.KeyDescriptor source, android.system.keystore2.KeyDescriptor destination) throws android.os.RemoteException
    {
    }
    /**
     * Deletes all keys in all hardware keystores.  Used when keystore is reset completely.  After
     * this function is called all keys with Tag::ROLLBACK_RESISTANCE in their hardware-enforced
     * authorization lists must be rendered permanently unusable.  Keys without
     * Tag::ROLLBACK_RESISTANCE may or may not be rendered unusable.
     */
    @Override public void deleteAllKeys() throws android.os.RemoteException
    {
    }
    /**
     * Returns a list of App UIDs that have keys associated with the given SID, under the
     * given user ID.
     * When a given user's LSKF is removed or biometric authentication methods are changed
     * (addition of a fingerprint, for example), authentication-bound keys may be invalidated.
     * This method allows the platform to find out which apps would be affected (for a given user)
     * when a given user secure ID is removed.
     * Callers require the `android.permission.MANAGE_USERS` Android permission
     * (not SELinux policy).
     * 
     * @param userId The affected user.
     * @param sid The user secure ID - identifier of the authentication method.
     * 
     * @return A list of APP UIDs, in the form of (AID + userId*AID_USER_OFFSET), that have
     *         keys auth-bound to the given SID. These values can be passed into the
     *         PackageManager for resolution.
     */
    @Override public long[] getAppUidsAffectedBySid(int userId, long sid) throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.security.maintenance.IKeystoreMaintenance
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.security.maintenance.IKeystoreMaintenance interface,
     * generating a proxy if needed.
     */
    public static android.security.maintenance.IKeystoreMaintenance asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.security.maintenance.IKeystoreMaintenance))) {
        return ((android.security.maintenance.IKeystoreMaintenance)iin);
      }
      return new android.security.maintenance.IKeystoreMaintenance.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(DESCRIPTOR);
      }
      switch (code)
      {
        case TRANSACTION_onUserAdded:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.onUserAdded(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_initUserSuperKeys:
        {
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          boolean _arg2;
          _arg2 = (0!=data.readInt());
          this.initUserSuperKeys(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onUserRemoved:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.onUserRemoved(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onUserLskfRemoved:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.onUserLskfRemoved(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onUserPasswordChanged:
        {
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          this.onUserPasswordChanged(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_clearNamespace:
        {
          int _arg0;
          _arg0 = data.readInt();
          long _arg1;
          _arg1 = data.readLong();
          this.clearNamespace(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_earlyBootEnded:
        {
          this.earlyBootEnded();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onDeviceOffBody:
        {
          this.onDeviceOffBody();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_migrateKeyNamespace:
        {
          android.system.keystore2.KeyDescriptor _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.system.keystore2.KeyDescriptor.CREATOR);
          android.system.keystore2.KeyDescriptor _arg1;
          _arg1 = _Parcel.readTypedObject(data, android.system.keystore2.KeyDescriptor.CREATOR);
          this.migrateKeyNamespace(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_deleteAllKeys:
        {
          this.deleteAllKeys();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_getAppUidsAffectedBySid:
        {
          int _arg0;
          _arg0 = data.readInt();
          long _arg1;
          _arg1 = data.readLong();
          long[] _result = this.getAppUidsAffectedBySid(_arg0, _arg1);
          reply.writeNoException();
          reply.writeLongArray(_result);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static final class Proxy implements android.security.maintenance.IKeystoreMaintenance
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
      public final java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      /**
       * Allows LockSettingsService to inform keystore about adding a new user.
       * Callers require 'ChangeUser' permission.
       * 
       * ## Error conditions:
       * `ResponseCode::PERMISSION_DENIED` - if the callers do not have the 'ChangeUser' permission.
       * `ResponseCode::SYSTEM_ERROR` - if failed to delete the keys of an existing user with the same
       * user id.
       * 
       * @param userId - Android user id
       */
      @Override public void onUserAdded(int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        _data.markSensitive();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onUserAdded, _data, _reply, android.os.IBinder.FLAG_CLEAR_BUF);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * Allows LockSettingsService to tell Keystore to create a user's superencryption keys and store
       * them encrypted by the given secret.  Requires 'ChangeUser' permission.
       * 
       * ## Error conditions:
       * `ResponseCode::PERMISSION_DENIED` - if caller does not have the 'ChangeUser' permission
       * `ResponseCode::SYSTEM_ERROR` - if failed to initialize the user's super keys
       * 
       * @param userId - Android user id
       * @param password - a secret derived from the synthetic password of the user
       * @param allowExisting - if true, then the keys already existing is not considered an error
       */
      @Override public void initUserSuperKeys(int userId, byte[] password, boolean allowExisting) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        _data.markSensitive();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(userId);
          _data.writeByteArray(password);
          _data.writeInt(((allowExisting)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_initUserSuperKeys, _data, _reply, android.os.IBinder.FLAG_CLEAR_BUF);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * Allows LockSettingsService to inform keystore about removing a user.
       * Callers require 'ChangeUser' permission.
       * 
       * ## Error conditions:
       * `ResponseCode::PERMISSION_DENIED` - if the callers do not have the 'ChangeUser' permission.
       * `ResponseCode::SYSTEM_ERROR` - if failed to delete the keys of the user being deleted.
       * 
       * @param userId - Android user id
       */
      @Override public void onUserRemoved(int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        _data.markSensitive();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onUserRemoved, _data, _reply, android.os.IBinder.FLAG_CLEAR_BUF);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * Allows LockSettingsService to tell Keystore that a user's LSKF is being removed, ie the
       * user's lock screen is changing to Swipe or None.  Requires 'ChangePassword' permission.
       * 
       * ## Error conditions:
       * `ResponseCode::PERMISSION_DENIED` - if caller does not have the 'ChangePassword' permission
       * `ResponseCode::SYSTEM_ERROR` - if failed to delete the user's auth-bound keys
       * 
       * @param userId - Android user id
       */
      @Override public void onUserLskfRemoved(int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        _data.markSensitive();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onUserLskfRemoved, _data, _reply, android.os.IBinder.FLAG_CLEAR_BUF);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * Allows LockSettingsService to inform keystore about password change of a user.
       * Callers require 'ChangePassword' permission.
       * 
       * ## Error conditions:
       * `ResponseCode::PERMISSION_DENIED` - if the callers does not have the 'ChangePassword'
       *                                     permission.
       * `ResponseCode::SYSTEM_ERROR` - if failed to delete the super encrypted keys of the user.
       * `ResponseCode::Locked' -  if the keystore is locked for the given user.
       * 
       * @param userId - Android user id
       * @param password - a secret derived from the synthetic password of the user
       */
      @Override public void onUserPasswordChanged(int userId, byte[] password) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        _data.markSensitive();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(userId);
          _data.writeByteArray(password);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onUserPasswordChanged, _data, _reply, android.os.IBinder.FLAG_CLEAR_BUF);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * This function deletes all keys within a namespace. It mainly gets called when an app gets
       * removed and all resources of this app need to be cleaned up.
       * 
       * @param domain - One of Domain.APP or Domain.SELINUX.
       * @param nspace - The UID of the app that is to be cleared if domain is Domain.APP or
       *                 the SEPolicy namespace if domain is Domain.SELINUX.
       */
      @Override public void clearNamespace(int domain, long nspace) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        _data.markSensitive();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(domain);
          _data.writeLong(nspace);
          boolean _status = mRemote.transact(Stub.TRANSACTION_clearNamespace, _data, _reply, android.os.IBinder.FLAG_CLEAR_BUF);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * This function notifies the Keymint device of the specified securityLevel that
       * early boot has ended, so that they no longer allow early boot keys to be used.
       * ## Error conditions:
       * `ResponseCode::PERMISSION_DENIED` - if the caller does not have the 'EarlyBootEnded'
       *                                     permission.
       * A KeyMint ErrorCode may be returned indicating a backend diagnosed error.
       */
      @Override public void earlyBootEnded() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        _data.markSensitive();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_earlyBootEnded, _data, _reply, android.os.IBinder.FLAG_CLEAR_BUF);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * Informs Keystore 2.0 that the an off body event was detected.
       * 
       * ## Error conditions:
       * `ResponseCode::PERMISSION_DENIED` - if the caller does not have the `ReportOffBody`
       *                                     permission.
       * `ResponseCode::SYSTEM_ERROR` - if an unexpected error occurred.
       */
      @Override public void onDeviceOffBody() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        _data.markSensitive();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onDeviceOffBody, _data, _reply, android.os.IBinder.FLAG_CLEAR_BUF);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * Migrate a key from one namespace to another. The caller must have use, grant, and delete
       * permissions on the source namespace and rebind permissions on the destination namespace.
       * The source may be specified by Domain::APP, Domain::SELINUX, or Domain::KEY_ID. The target
       * may be specified by Domain::APP or Domain::SELINUX.
       * 
       * ## Error conditions:
       * `ResponseCode::PERMISSION_DENIED` - If the caller lacks any of the required permissions.
       * `ResponseCode::KEY_NOT_FOUND` - If the source did not exist.
       * `ResponseCode::INVALID_ARGUMENT` - If the target exists or if any of the above mentioned
       *                                    requirements for the domain parameter are not met.
       * `ResponseCode::SYSTEM_ERROR` - An unexpected system error occurred.
       */
      @Override public void migrateKeyNamespace(android.system.keystore2.KeyDescriptor source, android.system.keystore2.KeyDescriptor destination) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        _data.markSensitive();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, source, 0);
          _Parcel.writeTypedObject(_data, destination, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_migrateKeyNamespace, _data, _reply, android.os.IBinder.FLAG_CLEAR_BUF);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * Deletes all keys in all hardware keystores.  Used when keystore is reset completely.  After
       * this function is called all keys with Tag::ROLLBACK_RESISTANCE in their hardware-enforced
       * authorization lists must be rendered permanently unusable.  Keys without
       * Tag::ROLLBACK_RESISTANCE may or may not be rendered unusable.
       */
      @Override public void deleteAllKeys() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        _data.markSensitive();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_deleteAllKeys, _data, _reply, android.os.IBinder.FLAG_CLEAR_BUF);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * Returns a list of App UIDs that have keys associated with the given SID, under the
       * given user ID.
       * When a given user's LSKF is removed or biometric authentication methods are changed
       * (addition of a fingerprint, for example), authentication-bound keys may be invalidated.
       * This method allows the platform to find out which apps would be affected (for a given user)
       * when a given user secure ID is removed.
       * Callers require the `android.permission.MANAGE_USERS` Android permission
       * (not SELinux policy).
       * 
       * @param userId The affected user.
       * @param sid The user secure ID - identifier of the authentication method.
       * 
       * @return A list of APP UIDs, in the form of (AID + userId*AID_USER_OFFSET), that have
       *         keys auth-bound to the given SID. These values can be passed into the
       *         PackageManager for resolution.
       */
      @Override public long[] getAppUidsAffectedBySid(int userId, long sid) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        _data.markSensitive();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        long[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(userId);
          _data.writeLong(sid);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAppUidsAffectedBySid, _data, _reply, android.os.IBinder.FLAG_CLEAR_BUF);
          _reply.readException();
          _result = _reply.createLongArray();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
    }
    static final int TRANSACTION_onUserAdded = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_initUserSuperKeys = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_onUserRemoved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_onUserLskfRemoved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_onUserPasswordChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_clearNamespace = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_earlyBootEnded = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_onDeviceOffBody = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_migrateKeyNamespace = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_deleteAllKeys = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_getAppUidsAffectedBySid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android.security.maintenance.IKeystoreMaintenance";
  /**
   * Allows LockSettingsService to inform keystore about adding a new user.
   * Callers require 'ChangeUser' permission.
   * 
   * ## Error conditions:
   * `ResponseCode::PERMISSION_DENIED` - if the callers do not have the 'ChangeUser' permission.
   * `ResponseCode::SYSTEM_ERROR` - if failed to delete the keys of an existing user with the same
   * user id.
   * 
   * @param userId - Android user id
   */
  public void onUserAdded(int userId) throws android.os.RemoteException;
  /**
   * Allows LockSettingsService to tell Keystore to create a user's superencryption keys and store
   * them encrypted by the given secret.  Requires 'ChangeUser' permission.
   * 
   * ## Error conditions:
   * `ResponseCode::PERMISSION_DENIED` - if caller does not have the 'ChangeUser' permission
   * `ResponseCode::SYSTEM_ERROR` - if failed to initialize the user's super keys
   * 
   * @param userId - Android user id
   * @param password - a secret derived from the synthetic password of the user
   * @param allowExisting - if true, then the keys already existing is not considered an error
   */
  public void initUserSuperKeys(int userId, byte[] password, boolean allowExisting) throws android.os.RemoteException;
  /**
   * Allows LockSettingsService to inform keystore about removing a user.
   * Callers require 'ChangeUser' permission.
   * 
   * ## Error conditions:
   * `ResponseCode::PERMISSION_DENIED` - if the callers do not have the 'ChangeUser' permission.
   * `ResponseCode::SYSTEM_ERROR` - if failed to delete the keys of the user being deleted.
   * 
   * @param userId - Android user id
   */
  public void onUserRemoved(int userId) throws android.os.RemoteException;
  /**
   * Allows LockSettingsService to tell Keystore that a user's LSKF is being removed, ie the
   * user's lock screen is changing to Swipe or None.  Requires 'ChangePassword' permission.
   * 
   * ## Error conditions:
   * `ResponseCode::PERMISSION_DENIED` - if caller does not have the 'ChangePassword' permission
   * `ResponseCode::SYSTEM_ERROR` - if failed to delete the user's auth-bound keys
   * 
   * @param userId - Android user id
   */
  public void onUserLskfRemoved(int userId) throws android.os.RemoteException;
  /**
   * Allows LockSettingsService to inform keystore about password change of a user.
   * Callers require 'ChangePassword' permission.
   * 
   * ## Error conditions:
   * `ResponseCode::PERMISSION_DENIED` - if the callers does not have the 'ChangePassword'
   *                                     permission.
   * `ResponseCode::SYSTEM_ERROR` - if failed to delete the super encrypted keys of the user.
   * `ResponseCode::Locked' -  if the keystore is locked for the given user.
   * 
   * @param userId - Android user id
   * @param password - a secret derived from the synthetic password of the user
   */
  public void onUserPasswordChanged(int userId, byte[] password) throws android.os.RemoteException;
  /**
   * This function deletes all keys within a namespace. It mainly gets called when an app gets
   * removed and all resources of this app need to be cleaned up.
   * 
   * @param domain - One of Domain.APP or Domain.SELINUX.
   * @param nspace - The UID of the app that is to be cleared if domain is Domain.APP or
   *                 the SEPolicy namespace if domain is Domain.SELINUX.
   */
  public void clearNamespace(int domain, long nspace) throws android.os.RemoteException;
  /**
   * This function notifies the Keymint device of the specified securityLevel that
   * early boot has ended, so that they no longer allow early boot keys to be used.
   * ## Error conditions:
   * `ResponseCode::PERMISSION_DENIED` - if the caller does not have the 'EarlyBootEnded'
   *                                     permission.
   * A KeyMint ErrorCode may be returned indicating a backend diagnosed error.
   */
  public void earlyBootEnded() throws android.os.RemoteException;
  /**
   * Informs Keystore 2.0 that the an off body event was detected.
   * 
   * ## Error conditions:
   * `ResponseCode::PERMISSION_DENIED` - if the caller does not have the `ReportOffBody`
   *                                     permission.
   * `ResponseCode::SYSTEM_ERROR` - if an unexpected error occurred.
   */
  public void onDeviceOffBody() throws android.os.RemoteException;
  /**
   * Migrate a key from one namespace to another. The caller must have use, grant, and delete
   * permissions on the source namespace and rebind permissions on the destination namespace.
   * The source may be specified by Domain::APP, Domain::SELINUX, or Domain::KEY_ID. The target
   * may be specified by Domain::APP or Domain::SELINUX.
   * 
   * ## Error conditions:
   * `ResponseCode::PERMISSION_DENIED` - If the caller lacks any of the required permissions.
   * `ResponseCode::KEY_NOT_FOUND` - If the source did not exist.
   * `ResponseCode::INVALID_ARGUMENT` - If the target exists or if any of the above mentioned
   *                                    requirements for the domain parameter are not met.
   * `ResponseCode::SYSTEM_ERROR` - An unexpected system error occurred.
   */
  public void migrateKeyNamespace(android.system.keystore2.KeyDescriptor source, android.system.keystore2.KeyDescriptor destination) throws android.os.RemoteException;
  /**
   * Deletes all keys in all hardware keystores.  Used when keystore is reset completely.  After
   * this function is called all keys with Tag::ROLLBACK_RESISTANCE in their hardware-enforced
   * authorization lists must be rendered permanently unusable.  Keys without
   * Tag::ROLLBACK_RESISTANCE may or may not be rendered unusable.
   */
  public void deleteAllKeys() throws android.os.RemoteException;
  /**
   * Returns a list of App UIDs that have keys associated with the given SID, under the
   * given user ID.
   * When a given user's LSKF is removed or biometric authentication methods are changed
   * (addition of a fingerprint, for example), authentication-bound keys may be invalidated.
   * This method allows the platform to find out which apps would be affected (for a given user)
   * when a given user secure ID is removed.
   * Callers require the `android.permission.MANAGE_USERS` Android permission
   * (not SELinux policy).
   * 
   * @param userId The affected user.
   * @param sid The user secure ID - identifier of the authentication method.
   * 
   * @return A list of APP UIDs, in the form of (AID + userId*AID_USER_OFFSET), that have
   *         keys auth-bound to the given SID. These values can be passed into the
   *         PackageManager for resolution.
   */
  public long[] getAppUidsAffectedBySid(int userId, long sid) throws android.os.RemoteException;
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
