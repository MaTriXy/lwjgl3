/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkResolveImageInfo2 {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkImage srcImage;
 *     VkImageLayout srcImageLayout;
 *     VkImage dstImage;
 *     VkImageLayout dstImageLayout;
 *     uint32_t regionCount;
 *     {@link VkImageResolve2 VkImageResolve2} const * pRegions;
 * }}</pre>
 */
public class VkResolveImageInfo2 extends Struct<VkResolveImageInfo2> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCIMAGE,
        SRCIMAGELAYOUT,
        DSTIMAGE,
        DSTIMAGELAYOUT,
        REGIONCOUNT,
        PREGIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCIMAGE = layout.offsetof(2);
        SRCIMAGELAYOUT = layout.offsetof(3);
        DSTIMAGE = layout.offsetof(4);
        DSTIMAGELAYOUT = layout.offsetof(5);
        REGIONCOUNT = layout.offsetof(6);
        PREGIONS = layout.offsetof(7);
    }

    protected VkResolveImageInfo2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkResolveImageInfo2 create(long address, @Nullable ByteBuffer container) {
        return new VkResolveImageInfo2(address, container);
    }

    /**
     * Creates a {@code VkResolveImageInfo2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkResolveImageInfo2(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code srcImage} field. */
    @NativeType("VkImage")
    public long srcImage() { return nsrcImage(address()); }
    /** @return the value of the {@code srcImageLayout} field. */
    @NativeType("VkImageLayout")
    public int srcImageLayout() { return nsrcImageLayout(address()); }
    /** @return the value of the {@code dstImage} field. */
    @NativeType("VkImage")
    public long dstImage() { return ndstImage(address()); }
    /** @return the value of the {@code dstImageLayout} field. */
    @NativeType("VkImageLayout")
    public int dstImageLayout() { return ndstImageLayout(address()); }
    /** @return the value of the {@code regionCount} field. */
    @NativeType("uint32_t")
    public int regionCount() { return nregionCount(address()); }
    /** @return a {@link VkImageResolve2.Buffer} view of the struct array pointed to by the {@code pRegions} field. */
    @NativeType("VkImageResolve2 const *")
    public VkImageResolve2.Buffer pRegions() { return npRegions(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkResolveImageInfo2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2 STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2} value to the {@code sType} field. */
    public VkResolveImageInfo2 sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkResolveImageInfo2 pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code srcImage} field. */
    public VkResolveImageInfo2 srcImage(@NativeType("VkImage") long value) { nsrcImage(address(), value); return this; }
    /** Sets the specified value to the {@code srcImageLayout} field. */
    public VkResolveImageInfo2 srcImageLayout(@NativeType("VkImageLayout") int value) { nsrcImageLayout(address(), value); return this; }
    /** Sets the specified value to the {@code dstImage} field. */
    public VkResolveImageInfo2 dstImage(@NativeType("VkImage") long value) { ndstImage(address(), value); return this; }
    /** Sets the specified value to the {@code dstImageLayout} field. */
    public VkResolveImageInfo2 dstImageLayout(@NativeType("VkImageLayout") int value) { ndstImageLayout(address(), value); return this; }
    /** Sets the address of the specified {@link VkImageResolve2.Buffer} to the {@code pRegions} field. */
    public VkResolveImageInfo2 pRegions(@NativeType("VkImageResolve2 const *") VkImageResolve2.Buffer value) { npRegions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkResolveImageInfo2 set(
        int sType,
        long pNext,
        long srcImage,
        int srcImageLayout,
        long dstImage,
        int dstImageLayout,
        VkImageResolve2.Buffer pRegions
    ) {
        sType(sType);
        pNext(pNext);
        srcImage(srcImage);
        srcImageLayout(srcImageLayout);
        dstImage(dstImage);
        dstImageLayout(dstImageLayout);
        pRegions(pRegions);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkResolveImageInfo2 set(VkResolveImageInfo2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkResolveImageInfo2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkResolveImageInfo2 malloc() {
        return new VkResolveImageInfo2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkResolveImageInfo2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkResolveImageInfo2 calloc() {
        return new VkResolveImageInfo2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkResolveImageInfo2} instance allocated with {@link BufferUtils}. */
    public static VkResolveImageInfo2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkResolveImageInfo2(memAddress(container), container);
    }

    /** Returns a new {@code VkResolveImageInfo2} instance for the specified memory address. */
    public static VkResolveImageInfo2 create(long address) {
        return new VkResolveImageInfo2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkResolveImageInfo2 createSafe(long address) {
        return address == NULL ? null : new VkResolveImageInfo2(address, null);
    }

    /**
     * Returns a new {@link VkResolveImageInfo2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkResolveImageInfo2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkResolveImageInfo2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkResolveImageInfo2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkResolveImageInfo2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkResolveImageInfo2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkResolveImageInfo2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkResolveImageInfo2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkResolveImageInfo2.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkResolveImageInfo2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkResolveImageInfo2 malloc(MemoryStack stack) {
        return new VkResolveImageInfo2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkResolveImageInfo2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkResolveImageInfo2 calloc(MemoryStack stack) {
        return new VkResolveImageInfo2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkResolveImageInfo2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkResolveImageInfo2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkResolveImageInfo2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkResolveImageInfo2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkResolveImageInfo2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkResolveImageInfo2.PNEXT); }
    /** Unsafe version of {@link #srcImage}. */
    public static long nsrcImage(long struct) { return memGetLong(struct + VkResolveImageInfo2.SRCIMAGE); }
    /** Unsafe version of {@link #srcImageLayout}. */
    public static int nsrcImageLayout(long struct) { return memGetInt(struct + VkResolveImageInfo2.SRCIMAGELAYOUT); }
    /** Unsafe version of {@link #dstImage}. */
    public static long ndstImage(long struct) { return memGetLong(struct + VkResolveImageInfo2.DSTIMAGE); }
    /** Unsafe version of {@link #dstImageLayout}. */
    public static int ndstImageLayout(long struct) { return memGetInt(struct + VkResolveImageInfo2.DSTIMAGELAYOUT); }
    /** Unsafe version of {@link #regionCount}. */
    public static int nregionCount(long struct) { return memGetInt(struct + VkResolveImageInfo2.REGIONCOUNT); }
    /** Unsafe version of {@link #pRegions}. */
    public static VkImageResolve2.Buffer npRegions(long struct) { return VkImageResolve2.create(memGetAddress(struct + VkResolveImageInfo2.PREGIONS), nregionCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkResolveImageInfo2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkResolveImageInfo2.PNEXT, value); }
    /** Unsafe version of {@link #srcImage(long) srcImage}. */
    public static void nsrcImage(long struct, long value) { memPutLong(struct + VkResolveImageInfo2.SRCIMAGE, value); }
    /** Unsafe version of {@link #srcImageLayout(int) srcImageLayout}. */
    public static void nsrcImageLayout(long struct, int value) { memPutInt(struct + VkResolveImageInfo2.SRCIMAGELAYOUT, value); }
    /** Unsafe version of {@link #dstImage(long) dstImage}. */
    public static void ndstImage(long struct, long value) { memPutLong(struct + VkResolveImageInfo2.DSTIMAGE, value); }
    /** Unsafe version of {@link #dstImageLayout(int) dstImageLayout}. */
    public static void ndstImageLayout(long struct, int value) { memPutInt(struct + VkResolveImageInfo2.DSTIMAGELAYOUT, value); }
    /** Sets the specified value to the {@code regionCount} field of the specified {@code struct}. */
    public static void nregionCount(long struct, int value) { memPutInt(struct + VkResolveImageInfo2.REGIONCOUNT, value); }
    /** Unsafe version of {@link #pRegions(VkImageResolve2.Buffer) pRegions}. */
    public static void npRegions(long struct, VkImageResolve2.Buffer value) { memPutAddress(struct + VkResolveImageInfo2.PREGIONS, value.address()); nregionCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkResolveImageInfo2.PREGIONS));
    }

    // -----------------------------------

    /** An array of {@link VkResolveImageInfo2} structs. */
    public static class Buffer extends StructBuffer<VkResolveImageInfo2, Buffer> implements NativeResource {

        private static final VkResolveImageInfo2 ELEMENT_FACTORY = VkResolveImageInfo2.create(-1L);

        /**
         * Creates a new {@code VkResolveImageInfo2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkResolveImageInfo2#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkResolveImageInfo2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkResolveImageInfo2.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkResolveImageInfo2.npNext(address()); }
        /** @return the value of the {@code srcImage} field. */
        @NativeType("VkImage")
        public long srcImage() { return VkResolveImageInfo2.nsrcImage(address()); }
        /** @return the value of the {@code srcImageLayout} field. */
        @NativeType("VkImageLayout")
        public int srcImageLayout() { return VkResolveImageInfo2.nsrcImageLayout(address()); }
        /** @return the value of the {@code dstImage} field. */
        @NativeType("VkImage")
        public long dstImage() { return VkResolveImageInfo2.ndstImage(address()); }
        /** @return the value of the {@code dstImageLayout} field. */
        @NativeType("VkImageLayout")
        public int dstImageLayout() { return VkResolveImageInfo2.ndstImageLayout(address()); }
        /** @return the value of the {@code regionCount} field. */
        @NativeType("uint32_t")
        public int regionCount() { return VkResolveImageInfo2.nregionCount(address()); }
        /** @return a {@link VkImageResolve2.Buffer} view of the struct array pointed to by the {@code pRegions} field. */
        @NativeType("VkImageResolve2 const *")
        public VkImageResolve2.Buffer pRegions() { return VkResolveImageInfo2.npRegions(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkResolveImageInfo2.Buffer sType(@NativeType("VkStructureType") int value) { VkResolveImageInfo2.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2 STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2} value to the {@code sType} field. */
        public VkResolveImageInfo2.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkResolveImageInfo2.Buffer pNext(@NativeType("void const *") long value) { VkResolveImageInfo2.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code srcImage} field. */
        public VkResolveImageInfo2.Buffer srcImage(@NativeType("VkImage") long value) { VkResolveImageInfo2.nsrcImage(address(), value); return this; }
        /** Sets the specified value to the {@code srcImageLayout} field. */
        public VkResolveImageInfo2.Buffer srcImageLayout(@NativeType("VkImageLayout") int value) { VkResolveImageInfo2.nsrcImageLayout(address(), value); return this; }
        /** Sets the specified value to the {@code dstImage} field. */
        public VkResolveImageInfo2.Buffer dstImage(@NativeType("VkImage") long value) { VkResolveImageInfo2.ndstImage(address(), value); return this; }
        /** Sets the specified value to the {@code dstImageLayout} field. */
        public VkResolveImageInfo2.Buffer dstImageLayout(@NativeType("VkImageLayout") int value) { VkResolveImageInfo2.ndstImageLayout(address(), value); return this; }
        /** Sets the address of the specified {@link VkImageResolve2.Buffer} to the {@code pRegions} field. */
        public VkResolveImageInfo2.Buffer pRegions(@NativeType("VkImageResolve2 const *") VkImageResolve2.Buffer value) { VkResolveImageInfo2.npRegions(address(), value); return this; }

    }

}