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

import net.kf5bau.orchesshtra.ssh.commands.TerminalCommandFactory
import net.kf5bau.orchesshtra.ssh.commands.esc.*

import org.junit.After
import org.junit.AfterClass
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test

import static org.junit.Assert.*
import static org.hamcrest.CoreMatchers.*

/**
 *
 * @author Carl Worley <developer@kf5bau.net>
 */
class TerminalCommandFactoryTest {

  public TerminalCommandFactoryTest() {
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
  public void escCommandFactory() {
    TerminalCommandFactory factory = new TerminalCommandFactory("esc")
    
    assertNotNull factory
    
    assertNull factory.getCommand("Z", ["Z", "TOP"])
    assertThat factory.getCommand("F", ["=", 0]), instanceOf(SetNormalForegroundColor.class)
    assertThat factory.getCommand("G", ["=", 0]), instanceOf(SetNormalBackgroundColor.class)
  }
}
