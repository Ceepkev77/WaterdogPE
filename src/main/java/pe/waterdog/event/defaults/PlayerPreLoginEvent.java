/**
 * Copyright 2020 WaterdogTEAM
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package pe.waterdog.event.defaults;

import pe.waterdog.event.CancellableEvent;
import pe.waterdog.event.Event;
import pe.waterdog.network.session.LoginData;

public class PlayerPreLoginEvent extends Event implements CancellableEvent {

    private LoginData loginData;
    private String cancelReason = "Login was cancelled";

    public PlayerPreLoginEvent(LoginData loginData) {
        this.loginData = loginData;
    }

    public LoginData getLoginData() {
        return this.loginData;
    }

    public String getCancelReason() {
        return this.cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }
}