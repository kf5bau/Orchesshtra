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
import net.kf5bau.orchesshtra.ssh.commands.csi.*

import static org.junit.Assert.*
import static org.hamcrest.CoreMatchers.*

/**
 *
 * @author Carl Worley <developer@kf5bau.net>
 */
class TerminalCommandFactoryTest extends GroovyTestCase {
  public void testCsiCommandFactory() {
    TerminalCommandFactory factory = new TerminalCommandFactory("csi")

    assertNotNull factory

    // there is no zztop command
    assertNull factory.getCommand("Z", [ "Z", "TOP" ])

    // make sure we get the correct commands for each command sequence
    assertThat factory.getCommand("F", [ "=", 0 ]),
        instanceOf(SetNormalForegroundColor.class)

    assertThat factory.getCommand("G", [ "=", 0 ]),
        instanceOf(SetNormalBackgroundColor.class)
  }
}
