package com.honey.springtest;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
class SpringtestApplicationTests {

	// @Autowired
	// @Qualifier("mySqlDataSource")
	// private DataSource dataSource;

//	@Test
//	public void springJdbcTemplateTest() {
//		try {
//			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//			String queryStr = "select * from student";
//			List<Student> resultList = new ArrayList<>();
//			jdbcTemplate.query(queryStr, (ResultSet resultSet) -> {
//				Student student = new Student();
//				student.setid(resultset.getstring("id"));
//				student.setStudentId(resultSet.getString("student_id"));
//				student.setStudentName(resultSet.getString("student_name"));
//				student.setAge(resultSet.getInt("age"));
//				resultList.add(student);
//			});
//			resultList.forEach((Student student) -> System.out.println(student));
//		} catch (Exception exception) {
//			exception.printStackTrace();
//		}
//	}
//
//	@Test
//	public void springDataSourceTest() {
//		try {
//			Connection connection = dataSource.getConnection();
//			Statement statement = connection.createStatement();
//			ResultSet resultSet = statement.executeQuery("select * from student");
//			Student student = null;
//			if (resultSet.next()) {
//				student = new Student();
//				student.setId(resultSet.getString("id"));
//				student.setStudentId(resultSet.getString("student_id"));
//				student.setStudentName(resultSet.getString("student_name"));
//				student.setAge(resultSet.getInt("age"));
//			}
//			System.out.println(student);
//			statement.close();
//			connection.close();
//		} catch (Exception exception) {
//			exception.printStackTrace();
//		}
//	}

	@Test
	public void testVerify() {
		List mockedList = mock(List.class);
		mockedList.add("one");
		mockedList.add("two");
		mockedList.add("three times");
		mockedList.add("three times");
		mockedList.add("three times");
		when(mockedList.size()).thenReturn(5);
		when(mockedList.isEmpty()).thenReturn(true);
		Assert.assertEquals(mockedList.size(), 5);
		Assert.assertTrue(mockedList.isEmpty());

		verify(mockedList, atLeastOnce()).add("one");
		verify(mockedList, times(1)).add("two");
		verify(mockedList, times(3)).add("three times");
		verify(mockedList, never()).isEmpty();
	}

}
