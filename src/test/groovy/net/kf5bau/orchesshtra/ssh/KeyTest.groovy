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

/**
 *
 * @author Carl Worley <developer@kf5bau.net>
 */
class KeyTest extends GroovyTestCase {
  void testValue() {
    // create a new key without any modified values
    Key k = new Key(value: 'F1')

    // check that the value property is what we were expecting
    assertEquals 'F1', k.value

    // check that the toString returns the value we are expecting
    assertToString k, 'F1'
    assertEquals "F1", "$k"
    assertEquals "AF1B", "A${ k }B"

    // when a key is created without modified values, the default value should
    // be returned for null modified property
    assertEquals 'F1', k.shift
    assertEquals 'F1', k.ctrl
    assertEquals 'F1', k.alt
  }

  public void testModifiers() {
    // create a new key with modified values
    Key k = new Key(value: 'F1', shift: 'S+F1', ctrl: 'C+F1', alt: 'A+F1')

    // check that each of the properties returns the expected value
    assertEquals 'S+F1', k.shift
    assertEquals "AS+F1B", "A${ k.shift }B"

    assertEquals 'C+F1', k.ctrl
    assertEquals "AC+F1B", "A${ k.ctrl }B"

    assertEquals 'A+F1', k.alt
    assertEquals "AA+F1B", "A${ k.alt }B"
  }
}
