package com.thinkaurelius.titan.diskstorage.berkeleyje;

import com.thinkaurelius.titan.BerkeleyJeStorageSetup;
import com.thinkaurelius.titan.diskstorage.KeyColumnValueStoreTest;
import com.thinkaurelius.titan.diskstorage.StorageException;
import com.thinkaurelius.titan.diskstorage.keycolumnvalue.KeyColumnValueStoreManager;
import com.thinkaurelius.titan.diskstorage.keycolumnvalue.keyvalue.KeyValueStoreManagerAdapter;
import org.apache.commons.configuration.Configuration;


public class BerkeleyDBjeKeyColumnValueVariableTest extends KeyColumnValueStoreTest {

    public KeyColumnValueStoreManager openStorageManager() throws StorageException {
        Configuration config = BerkeleyJeStorageSetup.getBerkeleyJEStorageConfiguration();
        BerkeleyJEStoreManager sm = new BerkeleyJEStoreManager(config);
        return new KeyValueStoreManagerAdapter(sm);
    }

}
