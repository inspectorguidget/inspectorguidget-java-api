/*
 * This file is part of InspectorGuidget.
 * InspectorGuidget is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * InspectorGuidget is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with InspectorGuidget.  If not, see <https://www.gnu.org/licenses/>.
 */

package fr.inria.inspectorguidget.api;

import fr.inria.inspectorguidget.data.UIData;

public interface UIDataExtractor {
	/**
	 * Launches the analysis
	 * @return The UI data extracted from the analysed code.
	 */
	UIData extractUIData();

	/**
	 * Adds an input resource to be processed by Spoon (either a file or a folder).
	 */
	void addInputResource(String file);

	void setSourceClasspath(final String ... args);
}
