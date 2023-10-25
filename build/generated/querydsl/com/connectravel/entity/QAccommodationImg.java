package com.connectravel.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAccommodationImg is a Querydsl query type for AccommodationImg
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAccommodationImg extends EntityPathBase<AccommodationImg> {

    private static final long serialVersionUID = 1720236447L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAccommodationImg accommodationImg = new QAccommodationImg("accommodationImg");

    public final QAccommodation accommodation;

    public final StringPath imgFile = createString("imgFile");

    public final NumberPath<Long> ino = createNumber("ino", Long.class);

    public QAccommodationImg(String variable) {
        this(AccommodationImg.class, forVariable(variable), INITS);
    }

    public QAccommodationImg(Path<? extends AccommodationImg> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAccommodationImg(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAccommodationImg(PathMetadata metadata, PathInits inits) {
        this(AccommodationImg.class, metadata, inits);
    }

    public QAccommodationImg(Class<? extends AccommodationImg> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.accommodation = inits.isInitialized("accommodation") ? new QAccommodation(forProperty("accommodation"), inits.get("accommodation")) : null;
    }

}

