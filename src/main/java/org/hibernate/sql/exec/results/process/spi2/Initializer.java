/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.sql.exec.results.process.spi2;

import org.hibernate.sql.exec.results.process.spi.RowProcessingState;

/**
 * Common interface for EntityReferenceInitializer and
 * CollectionReferenceInitializer contracts for the sole purpose
 * of defining a common element type for Returns to return their
 * collected initializer for itself and any fetches.
 *
 * @author Steve Ebersole
 */
public interface Initializer {
	void finishUpRow(RowProcessingState rowProcessingState);
}
