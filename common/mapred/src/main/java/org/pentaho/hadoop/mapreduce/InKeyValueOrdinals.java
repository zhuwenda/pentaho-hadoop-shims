/*******************************************************************************
 *
 * Pentaho Big Data
 *
 * Copyright (C) 2002-2017 by Hitachi Vantara : http://www.pentaho.com
 *
 *******************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/

package org.pentaho.hadoop.mapreduce;

import org.pentaho.di.core.row.RowMetaInterface;

public class InKeyValueOrdinals extends BaseKeyValueOrdinals {
  public InKeyValueOrdinals( RowMetaInterface rowMeta ) {
    super( rowMeta );
  }

  @Override
  protected final String getKeyName() {
    return "key"; //$NON-NLS-1$
  }

  @Override
  protected final String getValueName() {
    return "value"; //$NON-NLS-1$
  }
}
