/* Copyright 2010 Speech and Language Technologies Lab, The Ohio State University
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.osu.slate.relatedness.swwr.data.category;

import java.util.*;

/**
 * Comparator class for {@link CategoryIDCoverage} objects
 * based on the category ID.
 * <p>
 * Used for array searching/sorting.
 * 
 * @author weale
 * @version 1.0
 */
public class CICIDComparator implements Comparator<CategoryIDCoverage>
{
  public int compare(CategoryIDCoverage wc1, CategoryIDCoverage wc2)
  {
    return wc1.getCatID() - wc2.getCatID();
  }
}
