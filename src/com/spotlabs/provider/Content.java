/*
 * ******************************************************************************
 *  * Copyright 2014 Spot Labs Inc.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *   http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *  *****************************************************************************
 */

package com.spotlabs.provider;

import android.net.Uri;

/**
 * Created by dclark on 5/7/14.
 */
public class Content {
    public static String AUTHORITY = "com.spotlabs.provider.Content";
    public static Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY+"/");

    public static Uri getPropertyUri(String pkg, String property){
        return CONTENT_URI.buildUpon().appendPath(pkg).appendPath(property).build();
    }

    public static Uri getContentUri(int contentId){
        return Uri.withAppendedPath(CONTENT_URI,Integer.toString(contentId));
    }
}
