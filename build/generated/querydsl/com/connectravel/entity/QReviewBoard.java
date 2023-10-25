package com.connectravel.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReviewBoard is a Querydsl query type for ReviewBoard
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReviewBoard extends EntityPathBase<ReviewBoard> {

    private static final long serialVersionUID = -1773630944L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReviewBoard reviewBoard = new QReviewBoard("reviewBoard");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final QAccommodation accommodation;

    public final StringPath content = createString("content");

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final NumberPath<Double> grade = createNumber("grade", Double.class);

    public final QMember member;

    //inherited
    public final StringPath modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modTime = _super.modTime;

    public final NumberPath<Long> rbno = createNumber("rbno", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regTime = _super.regTime;

    public final ListPath<ReviewReply, QReviewReply> replies = this.<ReviewReply, QReviewReply>createList("replies", ReviewReply.class, QReviewReply.class, PathInits.DIRECT2);

    public final QReservation reservation;

    public final QRoom room;

    public QReviewBoard(String variable) {
        this(ReviewBoard.class, forVariable(variable), INITS);
    }

    public QReviewBoard(Path<? extends ReviewBoard> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReviewBoard(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReviewBoard(PathMetadata metadata, PathInits inits) {
        this(ReviewBoard.class, metadata, inits);
    }

    public QReviewBoard(Class<? extends ReviewBoard> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.accommodation = inits.isInitialized("accommodation") ? new QAccommodation(forProperty("accommodation"), inits.get("accommodation")) : null;
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member")) : null;
        this.reservation = inits.isInitialized("reservation") ? new QReservation(forProperty("reservation"), inits.get("reservation")) : null;
        this.room = inits.isInitialized("room") ? new QRoom(forProperty("room"), inits.get("room")) : null;
    }

}

