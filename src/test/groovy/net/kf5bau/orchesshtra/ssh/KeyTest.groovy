/*
 * Copyright 2013 Carl Worley.
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

package net.kf5bau.orchesshtra.ssh

import org.junit.Test
import static org.junit.Assert.*

/**
 *
 * @author Carl Worley <developer@kf5bau.net>
 */
class KeyTest {
  @Test
  public void value() {
    // create a new key without any modified values
    Key k = new Key(value: 'F1')

    // check that the value property is what we were expecting
    assertEquals k.value, 'F1'

    // check that the toString returns the value we are expecting
    assertEquals k.toString(), 'F1'
    assertEquals "$k", 'F1'

    // when a key is created without modified values, the default value should
    // be returned for null modified property
    assertEquals "$k.shift", 'F1'
    assertEquals "$k.ctrl", 'F1'
    assertEquals "$k.alt", 'F1'
  }

  @Test
  public void modifiers() {
    // create a new key with modified values
    Key k = new Key(value: 'F1', shift: 'S+F1', ctrl: 'C+F1', alt: 'A+F1')

    // check that each of the properties returns the expected value
    assertEquals "$k", 'F1'
    assertEquals "$k.shift", 'S+F1'
    assertEquals "$k.ctrl", 'C+F1'
    assertEquals "$k.alt", 'A+F1'
  }
}
