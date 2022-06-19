package me.kzv.ex.persistence;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void crud() {
        List<User> users = userRepository.findAll(Sort.by(Sort.Direction.DESC, "name"));

        users.forEach(System.out::println);
    }

    @Test
    void select() {
//        System.out.println(userRepository.findByName("hello"));
//
//        System.out.println("findByEmail: " + userRepository.findByEmail("test1@naver.com"));
//        System.out.println("findUserByEmail: " + userRepository.findUserByEmail("test1@naver.com"));
//        System.out.println("getByEmail: " + userRepository.getByEmail("test1@naver.com"));
//        System.out.println("readByEmail: " + userRepository.readByEmail("test1@naver.com"));
//        System.out.println("queryByEmail: " + userRepository.queryByEmail("test1@naver.com"));
//        System.out.println("searchByEmail: " + userRepository.searchByEmail("test1@naver.com"));
//        System.out.println("streamByEmail: " + userRepository.streamByEmail("test1@naver.com"));
//        System.out.println("findFirst1ByName: " + userRepository.findFirst1ByName("test1"));
//        System.out.println("findTop2ByName: " + userRepository.findTop2ByName("hello"));
//
//        System.out.println("findByEmailAndName: " + userRepository.findByEmailAndName("test@1google.com","hello"));
//        System.out.println("findByEmailOrName: " + userRepository.findByEmailOrName("test@1google.com","hello"));
//
//        System.out.println("findByCreatedAtAfter: " + userRepository.findByCreatedAtAfter(LocalDateTime.now().minusDays(1L)));
//        System.out.println("findByCreatedAtGreaterThan: " + userRepository.findByCreatedAtGreaterThan(LocalDateTime.now().minusDays(1L)));
//        System.out.println("findByIdAfter: " + userRepository.findByIdAfter(9L));
        System.out.println("findByCreatedAtBetween: " + userRepository.findByCreatedAtBetween(LocalDateTime.now().minusDays(1L), LocalDateTime.now()));
        System.out.println("findByCreatedAtGreaterThanEqualAndCreatedAtLessThanEqual: " + userRepository.findByCreatedAtGreaterThanEqualAndCreatedAtLessThanEqual(LocalDateTime.now().minusDays(1L), LocalDateTime.now()));

    }
}