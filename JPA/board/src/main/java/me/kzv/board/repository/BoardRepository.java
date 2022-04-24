package me.kzv.board.repository;

import me.kzv.board.entity.Board;
import me.kzv.board.repository.search.SearchBoardRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long>, SearchBoardRepository { // 인터페이스 다중상속

    @Query("select b, w from Board b left join b.writer w where b.bno = :bno")
    Object getBoardWithWriter(@Param("bno") Long bno);

    @Query("select b, r from Board b left join Reply  r on r.board = b where b.bno = :bno")
    List<Object[]> getBoardWithReply(@Param("bno") Long bno);


    @Query(
            value = " select b, w, count(r) " +
                    " from Board b " +
                    " left join b.writer w " +
                    " left join Reply r on r.board = b " +
                    " group by b",
            countQuery = "select count(b) from Board b"
    )
    Page<Object[]> getBoardWithReplyCount(Pageable pageable);


    @Query(
            "select b, w, count(r) " +
                    " from Board b left join b.writer w " +
                    " left outer join Reply r on r.board = b " +
                    " where b.bno = :bno"
    )
    Object getBoardByBno(@Param("bno") Long bno);
}