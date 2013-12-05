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

import org.junit.After
import org.junit.AfterClass
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test
import static org.junit.Assert.*

/**
 *
 * @author Carl Worley <developer@kf5bau.net>
 */
class KeyTest {

  public KeyTest() {
  }

  @BeforeClass
  public static void setUpClass() {
  }

  @AfterClass
  public static void tearDownClass() {
  }

  @Before
  public void setUp() {
  }

  @After
  public void tearDown() {
  }

  @Test
  public void value() {
    // create a new key without any modified values
    Key k = new Key(value: 'F1')

    // check that the value property is what we were expecting
    assert 'F1' == k.value

    // check that the toString returns the value we are expecting
    assert 'F1' == k.toString()
    assert 'F1' == "$k"

    // when a key is created without modified values, the default value should
    // be returned for null modified property
    assert 'F1' == "$k.shift"
    assert 'F1' == "$k.ctrl"
    assert 'F1' == "$k.alt"
  }

  @Test
  public void modifiers() {
    // create a new key with modified values
    Key k = new Key(value: 'F1', shift: 'S+F1', ctrl: 'C+F1', alt: 'A+F1')

    // check that each of the properties returns the expected value
    assert 'F1' == "$k"
    assert 'S+F1' == "$k.shift"
    assert 'C+F1' == "$k.ctrl"
    assert 'A+F1' == "$k.alt"
  }
}
