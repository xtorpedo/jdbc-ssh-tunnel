/**
 * Copyright © 2018 Xavier Jodoin (xavier@jodoin.me)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.torpedoquery.jdbc.ssh;

import com.jcraft.jsch.Session;

public class SSHSession {

	private int localPort;
	private Session session;

	public SSHSession(int localPort) {
		this.localPort = localPort;
	}

	public int getLocalPort() {
		return localPort;
	}

	public void setSession(Session session) {
		this.session = session;
	}
	
	public Session getSession() {
		return session;
	}

	public String getLocalHost() {
		return "localhost";
	}
}
