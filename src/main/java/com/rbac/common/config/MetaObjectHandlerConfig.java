package com.rbac.common.config;

import java.util.Date;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;



@Component
public class MetaObjectHandlerConfig extends MetaObjectHandler {

  @Override
  public void insertFill(MetaObject metaObject) {
   // System.out.println("插入方法实体填充");
  //  setFieldValByName("testDate", new Date(), metaObject);
  }

  @Override
  public void updateFill(MetaObject metaObject) {
   // System.out.println("更新方法实体填充");
  }
}
