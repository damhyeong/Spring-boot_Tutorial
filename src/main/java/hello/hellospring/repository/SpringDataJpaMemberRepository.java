package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    //JPQL select m from Member m where m.name = ?
    // findBy 를 붙이고 Name을 붙이면 변수명에 넣으면 된다. -> 개신기한 기능
    // findByNameAndId(String name, Long id) 이런 식으로도 가능하다.
    // findByEmail() 처럼 메서드 이름만으로 조회 기능 제공
    @Override
    Optional<Member> findByName(String name);
}
