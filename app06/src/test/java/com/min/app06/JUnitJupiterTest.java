package com.min.app06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.min.app06.dto.ContactDTO;
import com.min.app06.mapper.ContactMapper;

@SpringJUnitConfig(locations = {
    "file:src/main/webapp/WEB-INF/spring/root-context.xml"
  , "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
  })

/*
 * 
 */
// @ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})

class JUnitJupiterTest {

  @Autowired
  private ContactMapper contactMapper;

  @Test
  void insert_test() {
    
    ContactDTO contact = ContactDTO.builder()
         .name("min")
         .email("sldkj@sldkj.sdf")
         .mobile("100-564-354")
         .build();
          
    assertEquals(1, contactMapper.registerContact(contact));
  }

  @Test
  void select_one_test() {
  
    int contactNo = 1;
    
    ContactDTO contact = contactDAO.getContactByNo(contactNo);
    assertEquals("kim", contact.getName());
  }

  @Test
  void update_test() {
    
    ContactDTO contact = ContactDTO.builder()
         .name("lee")
         .email("sldkj@sldkj.sdf")
         .mobile("100-564-354")
         .contactNo(1)
         .build();
          
    assertEquals(1, contactDAO.modifyContact(contact));
  }
  
  @Test
  void select_list_test() {
    assertEquals(1, contactDAO.getContactList().size());
  }
  
  @Test
  void delete_test() {
    int contactNo = 2;
    assertEquals(1, contactDAO.removeContact(contactNo));
  }
  
  
}
  
  
