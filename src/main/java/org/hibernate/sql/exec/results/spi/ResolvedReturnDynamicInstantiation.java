/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.sql.exec.results.spi;

import java.util.List;

import org.hibernate.sql.ast.select.SqlSelectionDescriptor;

/**
 * @author Steve Ebersole
 */
public interface ResolvedReturnDynamicInstantiation extends ResolvedReturn {
	Class getInstantiationTarget();

	void setArguments(List<ResolvedArgument> arguments);

	interface ResolvedArgument {
		ResolvedReturn getResolvedArgument();

		String getAlias();

		List<SqlSelectionDescriptor> getSqlSelectionDescriptors();
	}
}