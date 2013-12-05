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

package net.kf5bau.orchesshtra.ssh.commands.esc

import net.kf5bau.orchesshtra.ssh.Terminal
import net.kf5bau.orchesshtra.ssh.commands.TerminalCommand

/**
 *
 * @author Carl Worley <developer@kf5bau.net>
 */
class SetNormalForegroundColor implements TerminalCommand {
  @Override
  boolean isCommand(String command, def parameters) {
    "F" == command && parameters.size() == 2 && "=" == parameters[0]
  }

  @Override
  void execute(def parameters, Terminal terminal) {

  }
}
