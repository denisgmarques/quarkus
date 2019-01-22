/*
 * Copyright 2019 Red Hat, Inc.
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

package org.jboss.shamrock.test.common;

/**
 * Manage the lifecycle of a test resource, for instance a H2 test server.
 * <p>
 * These resources are started before the first test is run, and are closed
 * at the end of the test suite. They are configured via the {@link ShamrockTestResource}
 * annotation, which can be placed on any class in the test suite.
 */
public interface ShamrockTestResourceLifecycleManager {

    /**
     * Start the test resource.
     */
    void start();

    /**
     * Stop the test resource.
     */
    void stop();
}
