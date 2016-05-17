/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/* Generated By:JJTree: Do not edit this line. AstConcatenation.java Version 4.3 */
package org.apache.el.parser;

import javax.el.ELException;

import org.apache.el.lang.EvaluationContext;

public class AstConcatenation extends SimpleNode {

    public AstConcatenation(int id) {
        super(id);
    }


    @Override
    public Object getValue(EvaluationContext ctx) throws ELException {
        // Coerce the two child nodes to string and then concatenate
        String s1 = coerceToString(children[0].getValue(ctx));
        String s2 = coerceToString(children[1].getValue(ctx));
        return s1 + s2;
    }


    @Override
    public Class<?> getType(EvaluationContext ctx) throws ELException {
        return String.class;
    }
}
/* JavaCC - OriginalChecksum=a95de353974c2c05fa5c7d695a1d50fd (do not edit this line) */
