/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux.liburing;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct io_uring_cqe {
 *     __u64 user_data;
 *     __s32 res;
 *     __u32 flags;
 *     __u64 big_cqe[0];
 * }}</pre>
 */
@NativeType("struct io_uring_cqe")
public class IOURingCQE extends Struct<IOURingCQE> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        USER_DATA,
        RES,
        FLAGS,
        BIG_CQE;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4),
            __member(4),
            __array(8, 0)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        USER_DATA = layout.offsetof(0);
        RES = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        BIG_CQE = layout.offsetof(3);
    }

    protected IOURingCQE(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingCQE create(long address, @Nullable ByteBuffer container) {
        return new IOURingCQE(address, container);
    }

    /**
     * Creates a {@code IOURingCQE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingCQE(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code user_data} field. */
    @NativeType("__u64")
    public long user_data() { return nuser_data(address()); }
    /** @return the value of the {@code res} field. */
    @NativeType("__s32")
    public int res() { return nres(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("__u32")
    public int flags() { return nflags(address()); }
    /** @return a {@link LongBuffer} view of the {@code big_cqe} field. */
    @NativeType("__u64[0]")
    public LongBuffer big_cqe() { return nbig_cqe(address()); }
    /** @return the value at the specified index of the {@code big_cqe} field. */
    @NativeType("__u64")
    public long big_cqe(int index) { return nbig_cqe(address(), index); }

    /** Sets the specified value to the {@code user_data} field. */
    public IOURingCQE user_data(@NativeType("__u64") long value) { nuser_data(address(), value); return this; }
    /** Sets the specified value to the {@code res} field. */
    public IOURingCQE res(@NativeType("__s32") int value) { nres(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public IOURingCQE flags(@NativeType("__u32") int value) { nflags(address(), value); return this; }
    /** Copies the specified {@link LongBuffer} to the {@code big_cqe} field. */
    public IOURingCQE big_cqe(@NativeType("__u64[0]") LongBuffer value) { nbig_cqe(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code big_cqe} field. */
    public IOURingCQE big_cqe(int index, @NativeType("__u64") long value) { nbig_cqe(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public IOURingCQE set(
        long user_data,
        int res,
        int flags,
        LongBuffer big_cqe
    ) {
        user_data(user_data);
        res(res);
        flags(flags);
        big_cqe(big_cqe);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingCQE set(IOURingCQE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingCQE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingCQE malloc() {
        return new IOURingCQE(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingCQE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingCQE calloc() {
        return new IOURingCQE(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingCQE} instance allocated with {@link BufferUtils}. */
    public static IOURingCQE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingCQE(memAddress(container), container);
    }

    /** Returns a new {@code IOURingCQE} instance for the specified memory address. */
    public static IOURingCQE create(long address) {
        return new IOURingCQE(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable IOURingCQE createSafe(long address) {
        return address == NULL ? null : new IOURingCQE(address, null);
    }

    /**
     * Returns a new {@link IOURingCQE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingCQE.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingCQE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingCQE.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingCQE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingCQE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingCQE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingCQE.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static IOURingCQE.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingCQE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingCQE malloc(MemoryStack stack) {
        return new IOURingCQE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingCQE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingCQE calloc(MemoryStack stack) {
        return new IOURingCQE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingCQE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingCQE.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingCQE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingCQE.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #user_data}. */
    public static long nuser_data(long struct) { return memGetLong(struct + IOURingCQE.USER_DATA); }
    /** Unsafe version of {@link #res}. */
    public static int nres(long struct) { return memGetInt(struct + IOURingCQE.RES); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + IOURingCQE.FLAGS); }
    /** Unsafe version of {@link #big_cqe}. */
    public static LongBuffer nbig_cqe(long struct) { return memLongBuffer(struct + IOURingCQE.BIG_CQE, 0); }
    /** Unsafe version of {@link #big_cqe(int) big_cqe}. */
    public static long nbig_cqe(long struct, int index) {
        return memGetLong(struct + IOURingCQE.BIG_CQE + check(index, 0) * 8);
    }

    /** Unsafe version of {@link #user_data(long) user_data}. */
    public static void nuser_data(long struct, long value) { memPutLong(struct + IOURingCQE.USER_DATA, value); }
    /** Unsafe version of {@link #res(int) res}. */
    public static void nres(long struct, int value) { memPutInt(struct + IOURingCQE.RES, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + IOURingCQE.FLAGS, value); }
    /** Unsafe version of {@link #big_cqe(LongBuffer) big_cqe}. */
    public static void nbig_cqe(long struct, LongBuffer value) {
        if (CHECKS) { checkGT(value, 0); }
        memCopy(memAddress(value), struct + IOURingCQE.BIG_CQE, value.remaining() * 8);
    }
    /** Unsafe version of {@link #big_cqe(int, long) big_cqe}. */
    public static void nbig_cqe(long struct, int index, long value) {
        memPutLong(struct + IOURingCQE.BIG_CQE + check(index, 0) * 8, value);
    }

    // -----------------------------------

    /** An array of {@link IOURingCQE} structs. */
    public static class Buffer extends StructBuffer<IOURingCQE, Buffer> implements NativeResource {

        private static final IOURingCQE ELEMENT_FACTORY = IOURingCQE.create(-1L);

        /**
         * Creates a new {@code IOURingCQE.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingCQE#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingCQE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code user_data} field. */
        @NativeType("__u64")
        public long user_data() { return IOURingCQE.nuser_data(address()); }
        /** @return the value of the {@code res} field. */
        @NativeType("__s32")
        public int res() { return IOURingCQE.nres(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("__u32")
        public int flags() { return IOURingCQE.nflags(address()); }
        /** @return a {@link LongBuffer} view of the {@code big_cqe} field. */
        @NativeType("__u64[0]")
        public LongBuffer big_cqe() { return IOURingCQE.nbig_cqe(address()); }
        /** @return the value at the specified index of the {@code big_cqe} field. */
        @NativeType("__u64")
        public long big_cqe(int index) { return IOURingCQE.nbig_cqe(address(), index); }

        /** Sets the specified value to the {@code user_data} field. */
        public IOURingCQE.Buffer user_data(@NativeType("__u64") long value) { IOURingCQE.nuser_data(address(), value); return this; }
        /** Sets the specified value to the {@code res} field. */
        public IOURingCQE.Buffer res(@NativeType("__s32") int value) { IOURingCQE.nres(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public IOURingCQE.Buffer flags(@NativeType("__u32") int value) { IOURingCQE.nflags(address(), value); return this; }
        /** Copies the specified {@link LongBuffer} to the {@code big_cqe} field. */
        public IOURingCQE.Buffer big_cqe(@NativeType("__u64[0]") LongBuffer value) { IOURingCQE.nbig_cqe(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code big_cqe} field. */
        public IOURingCQE.Buffer big_cqe(int index, @NativeType("__u64") long value) { IOURingCQE.nbig_cqe(address(), index, value); return this; }

    }

}