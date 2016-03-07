/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.sql.ast.expression;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.type.Type;

/**
 * @author Steve Ebersole
 */
public class CoalesceExpression implements Expression {
	private List<Expression> values = new ArrayList<Expression>();

	public List<Expression> getValues() {
		return values;
	}

	public void value(Expression expression) {
		values.add( expression );
	}

	@Override
	public Type getType() {
		return values.get( 0 ).getType();
	}
}