package com.iamtechknow.worldview.map;

import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.TileProvider;
import com.iamtechknow.worldview.model.Layer;

/**
 * Tile provider that accesses tiles from an image cache, or makes a network request to access them from a remote source.
 * This tile provider provides tiles for a given layer and date. Needs a reference to the presenter for cache access.
 */
public class CacheTileProvider implements TileProvider {
    private static final int SIZE = 256; //Assume all images are 256x256 pixels
    private static final byte[] EMPTY_ARRAY = new byte[0];

    private CachePresenter presenter;
    private Layer layer;

    public CacheTileProvider(Layer _layer, CachePresenter mapPresenter) {
        layer = _layer;
        presenter = mapPresenter;
    }

    /**
     * This method runs on a custom background thread.
     * The images should be in the cache now, so we can use the arguments to get the image, and then create a tile.
     */
    @Override
    public Tile getTile(int x, int y, int zoom) {
        byte[] imageData = presenter.getMapTile(layer, zoom, y, x);
        return imageData.length != EMPTY_ARRAY.length ? new Tile(SIZE, SIZE, imageData) : TileProvider.NO_TILE;
    }
}
