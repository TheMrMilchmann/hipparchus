/*
 * Licensed to the Hipparchus project under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The Hipparchus project licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
module org.hipparchus.geometry {

    requires transitive org.hipparchus.core;

    exports org.hipparchus.geometry;
    exports org.hipparchus.geometry.enclosing;
    exports org.hipparchus.geometry.euclidean.oned;
    exports org.hipparchus.geometry.euclidean.threed;
    exports org.hipparchus.geometry.euclidean.twod;
    exports org.hipparchus.geometry.hull;
    exports org.hipparchus.geometry.partitioning;
    exports org.hipparchus.geometry.spherical.oned;
    exports org.hipparchus.geometry.spherical.twod;

}
