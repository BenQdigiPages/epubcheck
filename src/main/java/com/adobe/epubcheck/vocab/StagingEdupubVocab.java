package com.adobe.epubcheck.vocab;

public class StagingEdupubVocab
{
  public static final String URI = "http://www.idpf.org/epub/vocab/structure/#";
  public static final Vocab VOCAB = new EnumVocab(EPUB_TYPES.class, URI);

  public static enum EPUB_TYPES
  {
    ABSTRACT,
    ANSWER,
    ANSWERS,
    ASSESSMENTS,
    BIBLIOREF,
    CREDIT,
    CREDITS,
    FEEDBACK,
    FILL_IN_THE_BLANK_PROBLEM,
    GENERAL_PROBLEM,
    GLOSSREF,
    INDEX_EDITOR_NOTE,
    INDEX_ENTRY,
    INDEX_ENTRY_LIST,
    INDEX_GROUP,
    INDEX_HEADNOTES,
    INDEX_LEGEND,
    INDEX_LOCATOR,
    INDEX_LOCATOR_LIST,
    INDEX_LOCATOR_RANGE,
    INDEX_TERM,
    INDEX_TERM_CATEGORIES,
    INDEX_TERM_CATEGORY,
    INDEX_XREF_PREFERRED,
    INDEX_XREF_RELATED,
    KEYWORD,
    LABEL,
    LEARNING_OBJECTIVES,
    LEARNING_OUTCOME,
    LEARNING_OUTCOMES,
    LEARNING_RESOURCES,
    LEARNING_STANDARD,
    LEARNING_STANDARDS,
    MATCH_PROBLEM,
    MULTIPLE_CHOICE_PROBLEM,
    ORDINAL,
    PRACTICE,
    PRACTICES,
    PULLQUOTE,
    QUESTION,
    REFERRER,
    TOC_BRIEF,
    TRUE_FALSE_PROBLEM;
  }
}
