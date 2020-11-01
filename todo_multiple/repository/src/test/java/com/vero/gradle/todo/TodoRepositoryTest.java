package com.vero.gradle.todo;

import org.junit.Assert;
import org.junit.Test;

public class TodoRepositoryTest {
    private TodoRepository repository=new TodoRepository();

    @Test
    public void testSave(){
        TodoItem item=new TodoItem("vero");
        repository.save(item);
        //测试失败
//        Assert.assertNull(repository.query(item.getName()));
        //测试成功
        Assert.assertNotNull(repository.query(item.getName()));
    }
}
