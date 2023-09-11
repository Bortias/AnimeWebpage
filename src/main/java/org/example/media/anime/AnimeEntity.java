package org.example.media.anime;

import org.example.media.manga.BaseMediaType;
import org.example.media.manga.PersonEntity;
import org.example.media.manga.StudioEntity;

import java.util.UUID;

public class AnimeEntity extends BaseMediaType {
    private UUID uuid;

    private PersonEntity sourceAuthor;

    private PersonEntity director;

    private StudioEntity studio;

    private String description;

    //TODO: seasons, story arc, number of seasons?
}
