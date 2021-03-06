package com.iamtechknow.terraview.data;

import android.support.annotation.NonNull;

import com.iamtechknow.terraview.model.Category;
import com.iamtechknow.terraview.model.Layer;
import com.iamtechknow.terraview.model.Measurement;

import java.util.HashMap;
import java.util.List;

import io.reactivex.Single;

/**
 * Contract that defines required APIs for a layer data source,
 * including the local database and XML/JSON parsers (remote source)
 */
public interface DataSource {

    //Callback for loading from local or remote source
    interface LoadCallback {
        void onDataLoaded();

        void onDataNotAvailable();
    }

    void loadData(@NonNull LoadCallback callback);

    List<Layer> getLayers();

    Single<List<Layer>> getLayersForMeasurement(String m);

    Single<List<Measurement>> getMeasurementsForCategory(String c);

    List<Category> getCategories();

    HashMap<String, Layer> getLayerTable();
}
