package com.tfg.keybank.ws.batch;

import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.core.io.Resource;

import com.tfg.keybank.ws.model.Users;

public class Reader extends FlatFileItemReader<Users> {
	
	public Reader(Resource resource) {
		super();
		setResource(resource);
		DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
		lineTokenizer.setNames(new String[] { "userid", "name", "dept", "amount","orderId" });
		lineTokenizer.setDelimiter(",");
	    lineTokenizer.setStrict(false);
	    BeanWrapperFieldSetMapper<Users> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
        fieldSetMapper.setTargetType(Users.class);
		DefaultLineMapper<Users> defaultLineMapper = new DefaultLineMapper<>();
		defaultLineMapper.setLineTokenizer(lineTokenizer);
		defaultLineMapper.setFieldSetMapper(fieldSetMapper);
		setLineMapper(defaultLineMapper);
	}
	
}
