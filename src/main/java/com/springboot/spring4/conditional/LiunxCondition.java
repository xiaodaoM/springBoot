package com.springboot.spring4.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class LiunxCondition implements Condition{

	@Override
	public boolean matches(ConditionContext condition, AnnotatedTypeMetadata arg1) {
		// TODO Auto-generated method stub
		return condition.getEnvironment().getProperty("os.name").contains("Linux");
	}

}
