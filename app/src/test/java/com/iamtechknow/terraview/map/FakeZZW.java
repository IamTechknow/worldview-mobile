package com.iamtechknow.terraview.map;

import android.os.IBinder;
import android.os.RemoteException;

import com.google.android.gms.maps.model.internal.zzw;

/**
 * A fake object used only for mocking and testing purposes to create a TileProvider.
 * This runs on an unit testing JVM and not on Android
 */
public class FakeZZW implements zzw {
    @Override
    public void remove() throws RemoteException {}

    @Override
    public void clearTileCache() throws RemoteException {}

    @Override
    public String getId() throws RemoteException {
        return null;
    }

    @Override
    public void setZIndex(float v) throws RemoteException {}

    @Override
    public float getZIndex() throws RemoteException {
        return 0;
    }

    @Override
    public void setVisible(boolean b) throws RemoteException {}

    @Override
    public boolean isVisible() throws RemoteException {
        return false;
    }

    @Override
    public boolean zza(zzw zzw) throws RemoteException {
        return false;
    }

    @Override
    public int hashCodeRemote() throws RemoteException {
        return 0;
    }

    @Override
    public void setFadeIn(boolean b) throws RemoteException {}

    @Override
    public boolean getFadeIn() throws RemoteException {
        return false;
    }

    @Override
    public void setTransparency(float v) throws RemoteException {}

    @Override
    public float getTransparency() throws RemoteException {
        return 0;
    }

    @Override
    public IBinder asBinder() {
        return null;
    }
}
