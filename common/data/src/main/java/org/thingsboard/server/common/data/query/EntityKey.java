/**
 * Copyright © 2016-2020 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.server.common.data.query;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = EntityKeyDeserializer.class)
public class EntityKey {

    private final EntityKeyType type;
    private final String key;
    private final boolean dataConversion;

    public EntityKeyType getType() {
        return type;
    }

    public String getKey() {
        return key;
    }

    public boolean isDataConversion() {
        return dataConversion;
    }

    public EntityKey(EntityKeyType type, String key, boolean dataConversion) {
        this.type = type;
        this.key = key;
        this.dataConversion = dataConversion;
    }

    public EntityKey(String entityKeyField) {
        this.type = EntityKeyType.ENTITY_FIELD;
        this.key = entityKeyField;
        this.dataConversion = false;
    }

}
