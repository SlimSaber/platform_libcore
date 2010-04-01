/*
 * Copyright (C) 2008 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dalvik.system;

/**
 * Is thrown when the VM determines that a DEX file's cache is out of date, and
 * that there is no way to recreate it.
 *
 * @hide
 */
public class StaleDexCacheError extends VirtualMachineError {
    /**
     * Creates a new exception instance and initializes it with default values.
     */
    public StaleDexCacheError() {
        super();
    }

    /**
     * Creates a new exception instance and initializes it with a given message.
     * 
     * @param detailMessage the error message
     */
    public StaleDexCacheError(String detailMessage) {
        super(detailMessage);
    }
}
