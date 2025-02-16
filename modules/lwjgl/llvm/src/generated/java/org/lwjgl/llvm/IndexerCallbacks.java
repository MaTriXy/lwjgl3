/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct IndexerCallbacks {
 *     int (* abortQuery) (CXClientData client_data, void * reserved);
 *     void (* diagnostic) (CXClientData client_data, CXDiagnosticSet diagnosticSet, void * reserved);
 *     CXIdxClientFile (* enteredMainFile) (CXClientData client_data, CXFile mainFile, void * reserved);
 *     CXIdxClientFile (* ppIncludedFile) (CXClientData client_data, CXIdxIncludedFileInfo const * info);
 *     CXIdxClientASTFile (* importedASTFile) (CXClientData client_data, CXIdxImportedASTFileInfo const * info);
 *     CXIdxClientContainer (* startedTranslationUnit) (CXClientData client_data, void * reserved);
 *     void (* indexDeclaration) (CXClientData client_data, CXIdxDeclInfo const * info);
 *     void (* indexEntityReference) (CXClientData client_data, CXIdxEntityRefInfo const * info);
 * }}</pre>
 */
public class IndexerCallbacks extends Struct<IndexerCallbacks> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ABORTQUERY,
        DIAGNOSTIC,
        ENTEREDMAINFILE,
        PPINCLUDEDFILE,
        IMPORTEDASTFILE,
        STARTEDTRANSLATIONUNIT,
        INDEXDECLARATION,
        INDEXENTITYREFERENCE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ABORTQUERY = layout.offsetof(0);
        DIAGNOSTIC = layout.offsetof(1);
        ENTEREDMAINFILE = layout.offsetof(2);
        PPINCLUDEDFILE = layout.offsetof(3);
        IMPORTEDASTFILE = layout.offsetof(4);
        STARTEDTRANSLATIONUNIT = layout.offsetof(5);
        INDEXDECLARATION = layout.offsetof(6);
        INDEXENTITYREFERENCE = layout.offsetof(7);
    }

    protected IndexerCallbacks(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IndexerCallbacks create(long address, @Nullable ByteBuffer container) {
        return new IndexerCallbacks(address, container);
    }

    /**
     * Creates a {@code IndexerCallbacks} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IndexerCallbacks(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code abortQuery} field. */
    @NativeType("int (*) (CXClientData, void *)")
    public IndexerAbortQuery abortQuery() { return nabortQuery(address()); }
    /** @return the value of the {@code diagnostic} field. */
    @NativeType("void (*) (CXClientData, CXDiagnosticSet, void *)")
    public IndexerDiagnostic diagnostic() { return ndiagnostic(address()); }
    /** @return the value of the {@code enteredMainFile} field. */
    @NativeType("CXIdxClientFile (*) (CXClientData, CXFile, void *)")
    public IndexerEnteredMainFile enteredMainFile() { return nenteredMainFile(address()); }
    /** @return the value of the {@code ppIncludedFile} field. */
    @NativeType("CXIdxClientFile (*) (CXClientData, CXIdxIncludedFileInfo const *)")
    public IndexerIncludedFile ppIncludedFile() { return nppIncludedFile(address()); }
    /** @return the value of the {@code importedASTFile} field. */
    @NativeType("CXIdxClientASTFile (*) (CXClientData, CXIdxImportedASTFileInfo const *)")
    public IndexerImportedASTFile importedASTFile() { return nimportedASTFile(address()); }
    /** @return the value of the {@code startedTranslationUnit} field. */
    @NativeType("CXIdxClientContainer (*) (CXClientData, void *)")
    public IndexerStartedTranslationUnit startedTranslationUnit() { return nstartedTranslationUnit(address()); }
    /** @return the value of the {@code indexDeclaration} field. */
    @NativeType("void (*) (CXClientData, CXIdxDeclInfo const *)")
    public IndexerIndexDeclaration indexDeclaration() { return nindexDeclaration(address()); }
    /** @return the value of the {@code indexEntityReference} field. */
    @NativeType("void (*) (CXClientData, CXIdxEntityRefInfo const *)")
    public IndexerIndexEntityReference indexEntityReference() { return nindexEntityReference(address()); }

    // -----------------------------------

    /** Returns a new {@code IndexerCallbacks} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IndexerCallbacks malloc() {
        return new IndexerCallbacks(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IndexerCallbacks} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IndexerCallbacks calloc() {
        return new IndexerCallbacks(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IndexerCallbacks} instance allocated with {@link BufferUtils}. */
    public static IndexerCallbacks create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IndexerCallbacks(memAddress(container), container);
    }

    /** Returns a new {@code IndexerCallbacks} instance for the specified memory address. */
    public static IndexerCallbacks create(long address) {
        return new IndexerCallbacks(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable IndexerCallbacks createSafe(long address) {
        return address == NULL ? null : new IndexerCallbacks(address, null);
    }

    /**
     * Returns a new {@link IndexerCallbacks.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IndexerCallbacks.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IndexerCallbacks.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IndexerCallbacks.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IndexerCallbacks.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IndexerCallbacks.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IndexerCallbacks.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IndexerCallbacks.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static IndexerCallbacks.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static IndexerCallbacks mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static IndexerCallbacks callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static IndexerCallbacks mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static IndexerCallbacks callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static IndexerCallbacks.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static IndexerCallbacks.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static IndexerCallbacks.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static IndexerCallbacks.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code IndexerCallbacks} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IndexerCallbacks malloc(MemoryStack stack) {
        return new IndexerCallbacks(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IndexerCallbacks} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IndexerCallbacks calloc(MemoryStack stack) {
        return new IndexerCallbacks(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IndexerCallbacks.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IndexerCallbacks.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IndexerCallbacks.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IndexerCallbacks.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #abortQuery}. */
    public static IndexerAbortQuery nabortQuery(long struct) { return IndexerAbortQuery.create(memGetAddress(struct + IndexerCallbacks.ABORTQUERY)); }
    /** Unsafe version of {@link #diagnostic}. */
    public static IndexerDiagnostic ndiagnostic(long struct) { return IndexerDiagnostic.create(memGetAddress(struct + IndexerCallbacks.DIAGNOSTIC)); }
    /** Unsafe version of {@link #enteredMainFile}. */
    public static IndexerEnteredMainFile nenteredMainFile(long struct) { return IndexerEnteredMainFile.create(memGetAddress(struct + IndexerCallbacks.ENTEREDMAINFILE)); }
    /** Unsafe version of {@link #ppIncludedFile}. */
    public static IndexerIncludedFile nppIncludedFile(long struct) { return IndexerIncludedFile.create(memGetAddress(struct + IndexerCallbacks.PPINCLUDEDFILE)); }
    /** Unsafe version of {@link #importedASTFile}. */
    public static IndexerImportedASTFile nimportedASTFile(long struct) { return IndexerImportedASTFile.create(memGetAddress(struct + IndexerCallbacks.IMPORTEDASTFILE)); }
    /** Unsafe version of {@link #startedTranslationUnit}. */
    public static IndexerStartedTranslationUnit nstartedTranslationUnit(long struct) { return IndexerStartedTranslationUnit.create(memGetAddress(struct + IndexerCallbacks.STARTEDTRANSLATIONUNIT)); }
    /** Unsafe version of {@link #indexDeclaration}. */
    public static IndexerIndexDeclaration nindexDeclaration(long struct) { return IndexerIndexDeclaration.create(memGetAddress(struct + IndexerCallbacks.INDEXDECLARATION)); }
    /** Unsafe version of {@link #indexEntityReference}. */
    public static IndexerIndexEntityReference nindexEntityReference(long struct) { return IndexerIndexEntityReference.create(memGetAddress(struct + IndexerCallbacks.INDEXENTITYREFERENCE)); }

    // -----------------------------------

    /** An array of {@link IndexerCallbacks} structs. */
    public static class Buffer extends StructBuffer<IndexerCallbacks, Buffer> implements NativeResource {

        private static final IndexerCallbacks ELEMENT_FACTORY = IndexerCallbacks.create(-1L);

        /**
         * Creates a new {@code IndexerCallbacks.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IndexerCallbacks#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected IndexerCallbacks getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code abortQuery} field. */
        @NativeType("int (*) (CXClientData, void *)")
        public IndexerAbortQuery abortQuery() { return IndexerCallbacks.nabortQuery(address()); }
        /** @return the value of the {@code diagnostic} field. */
        @NativeType("void (*) (CXClientData, CXDiagnosticSet, void *)")
        public IndexerDiagnostic diagnostic() { return IndexerCallbacks.ndiagnostic(address()); }
        /** @return the value of the {@code enteredMainFile} field. */
        @NativeType("CXIdxClientFile (*) (CXClientData, CXFile, void *)")
        public IndexerEnteredMainFile enteredMainFile() { return IndexerCallbacks.nenteredMainFile(address()); }
        /** @return the value of the {@code ppIncludedFile} field. */
        @NativeType("CXIdxClientFile (*) (CXClientData, CXIdxIncludedFileInfo const *)")
        public IndexerIncludedFile ppIncludedFile() { return IndexerCallbacks.nppIncludedFile(address()); }
        /** @return the value of the {@code importedASTFile} field. */
        @NativeType("CXIdxClientASTFile (*) (CXClientData, CXIdxImportedASTFileInfo const *)")
        public IndexerImportedASTFile importedASTFile() { return IndexerCallbacks.nimportedASTFile(address()); }
        /** @return the value of the {@code startedTranslationUnit} field. */
        @NativeType("CXIdxClientContainer (*) (CXClientData, void *)")
        public IndexerStartedTranslationUnit startedTranslationUnit() { return IndexerCallbacks.nstartedTranslationUnit(address()); }
        /** @return the value of the {@code indexDeclaration} field. */
        @NativeType("void (*) (CXClientData, CXIdxDeclInfo const *)")
        public IndexerIndexDeclaration indexDeclaration() { return IndexerCallbacks.nindexDeclaration(address()); }
        /** @return the value of the {@code indexEntityReference} field. */
        @NativeType("void (*) (CXClientData, CXIdxEntityRefInfo const *)")
        public IndexerIndexEntityReference indexEntityReference() { return IndexerCallbacks.nindexEntityReference(address()); }

    }

}