/*
 * Copyright 2019-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.aot.gradle.dsl;

/**
 * @author Brian Clozel
 */
public enum AotMode {

	/**
	 *  Default. Generates AOT Spring factories, application context bootstrap, native configuration, native-image.properties as well as substitutions.
	 */
	NATIVE("native"),

	/**
	 *  Designed to be used with the configuration generated by the tracing agent. Generates AOT Spring factories, application context bootstrap, native-image.properties as well as substitutions.
	 */
	NATIVE_AGENT("native-agent");

	private final String slug;

	AotMode(String slug) {
		this.slug = slug;
	}

	public String getSlug() {
		return this.slug;
	}
}
